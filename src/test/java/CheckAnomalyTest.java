import CustomExceptions.RoomShareException;
import Model_Classes.Meeting;
import Operations.Storage;
import Operations.TaskList;
import Operations.Parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;

public class CheckAnomalyTest {
    private static final Parser parser = new Parser();
    private static final Storage storage = new Storage();
    private static Meeting meeting;
    private static Date at1, at2, at3, at4, at5;
    private static TaskList taskList;

    static {
        try {
            at1 = parser.formatDateCustom_1("12/12/2019 12:00");
            at2 = parser.formatDateCustom_1("20/12/2019 12:00");
            at3 = parser.formatDateCustom_1("12/12/2019 10:00");
            at4 = parser.formatDateCustom_1("20/12/2019 13:00");
            at5 = parser.formatDateCustom_1("21/12/2019 13:00");
            taskList = new TaskList(storage.loadFile("data.txt"));
            Meeting event = new Meeting("test2", at2);
        } catch (RoomShareException e) {
            e.printStackTrace();
        }
    }

    /*
    @Test
    public void timeCheckFixedTest() { assertEquals(true, new CheckAnomaly().checkTime(new Meeting()); }

    @Test
    public void timeCheckOnlyDateTrueTest() {
        assertEquals(true, new CheckAnomaly().checkTime(at1));
    }

    @Test
    public void timeCheckOnlyDateFalseTest() {
        assertEquals(false, new CheckAnomaly().checkTime(at5));
    }
*/
}