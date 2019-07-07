package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {

   private Frog testFrog;

    @Before
    public void setup(){

        testFrog = new Frog("frogName");
    }

    @Test
    public void speakTest(){
        String expected =  "Ribbit...Ribbit";

        String actual = testFrog.speak();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void instanceOfPetTest() {
        assertNotNull(testFrog);
    }

    @Test
    public void getNameTest() {
        String expected = "frogName";
        String actual = testFrog.getName();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        String expected = "Frog";
        String actual = testFrog.getType();
        //assert
        assertEquals(expected, actual);
    }
}
