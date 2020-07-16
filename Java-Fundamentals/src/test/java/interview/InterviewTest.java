package interview;
import com.JavaFundamentals.interview.Interview;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InterviewTest {

    private Interview interview;

    @Before
    public void setup() {
        this.interview = new Interview();
    }

    @Test
    public void findMissingNumberTest0() {
        int[] input = {1, 2, 3, 4, 5, 7};
        int expected = 6;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findMissingNumberTest1() {
        int[] input = {6, 1, 5, 4, 2, 8, 3};
        int expected = 7;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findMissingNumberTest2() {
        int[] input = {6, 1, 5, 4, 2, 8, 7, 3, 10};
        int expected = 9;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }
}
