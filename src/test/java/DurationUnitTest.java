import org.example.Prescription.DurationUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationUnitTest {

    @Test
    public void matchUnitBySingularString() {
        assertSame(DurationUnit.WEEK, DurationUnit.getByTextValue("week"));
    }

    @Test
    public void matchUnitByPluralString() {
        assertEquals(DurationUnit.WEEK, DurationUnit.getByTextValue("weeks"));
    }

    @Test
    public void returnsNullForUnmatchedUnit(){
        assertNull(DurationUnit.getByTextValue("boop"));
    }

}
