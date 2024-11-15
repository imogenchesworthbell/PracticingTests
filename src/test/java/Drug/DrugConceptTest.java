package Drug;

import org.example.Drug.DispensableDrug;
import org.example.Drug.DrugClassification;
import org.example.Drug.DrugConcept;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DrugConceptTest {

    private final static DrugConcept TEST_CONCEPT = new DrugConcept(new DrugClassification[]{
            DrugClassification.ANTIANXIETY,
            DrugClassification.ANALGESICS_NARCOTIC,
            DrugClassification.NARCOTIC_ANTIHISTAMINE});

    @Test
    void drugBelongsInConceptIfOneClassMatches(){
        DispensableDrug drug = new DispensableDrug("adrug",
                new DrugClassification[] {DrugClassification.ANALGESIC,
                        DrugClassification.ANTIANXIETY}, false);
        assertTrue(TEST_CONCEPT.isDrugInConcept(drug));
    }

    @Test
    void drugNotInConceptIfNoClassesMatch(){
        DispensableDrug drug = new DispensableDrug("adrug",
                new DrugClassification[] {DrugClassification.ANALGESIC,
                        DrugClassification.NASAL_CORTICOSTEROIDS}, false);
        assertFalse(TEST_CONCEPT.isDrugInConcept(drug));
    }
}
