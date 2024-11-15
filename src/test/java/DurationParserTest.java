import org.example.Prescription.DurationParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DurationParserTest {

    @Test
    public void parserDurationWithValidUnityAndQuantity(){
        assertEquals(14, DurationParser.parseDays("2 weeks"));
        assertEquals(30, DurationParser.parseDays("1 month"));
    }

}
