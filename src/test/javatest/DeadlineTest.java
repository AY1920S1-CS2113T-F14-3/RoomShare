package javatest;



import Model_Classes.Deadline;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {
    private static Date by;

    @Test
    public void testStringConversion() {
        assertEquals("[D][\u2718] homework (by: Sun Dec 22 18:00:00 SGT 2019)", new Deadline("homework", by).toString());
    }
}