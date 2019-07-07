package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat testCat;

    @Before
    public void setup(){
        testCat = new Cat("catName");
    }

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = testCat.speak();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void instanceOfPetTest() {
        assertTrue(testCat instanceof Pet);
    }

    @Test
    public void getNameTest() {
        String expected = "catName";
        String actual = testCat.getName();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        String expected = "Cat";
        String actual = testCat.getType();
        //assert
        assertEquals(expected, actual);
    }

}
