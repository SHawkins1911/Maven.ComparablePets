import io.zipcoder.Frog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfValidPetTest {
    Frog testFrog;

    @Before
    public void setup(){
        testFrog = new Frog("Frogger");
    }

    @Test
    public void checkValidTest(){
        String expected = "Frog";
        String actual = testFrog.getType();
        assertEquals(expected, actual);
    }
}
