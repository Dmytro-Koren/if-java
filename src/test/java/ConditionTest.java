import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ConditionTest {

    @Test
    public void testTask1() {
        assertEquals(4, Condition.task1(2));
        assertEquals(0, Condition.task1(0));
        assertEquals(11, Condition.task1(-11));
    }

    @Test
    public void testTask2() {
        assertEquals(410, Condition.task2(401));
        assertEquals(999, Condition.task2(999));
        assertEquals(730, Condition.task2(370));
        assertEquals(652, Condition.task2(625));
    }
}