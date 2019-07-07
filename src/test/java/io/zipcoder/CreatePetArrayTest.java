package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.*;

public class CreatePetArrayTest {

    private ByteArrayInputStream in = new ByteArrayInputStream("dog\n dogName".getBytes());
    private Console console;

    private CreatePetArray createPetArray;

    Scanner scanner;
    @Before
    public void setup() {
        scanner = new Scanner(in);
        console = new Console();
        createPetArray = new CreatePetArray(console, scanner);
    }

    @Test
    public void createPetsTest(){
        ArrayList<Pet> testPetArray = createPetArray.createPets(1);
        assertEquals(1, testPetArray.size());

    }


    @Test
    public void getNameTest(){
        ArrayList<Pet> testPetArray = createPetArray.createPets(1);
        String expected = "dogName";
        String actual = testPetArray.get(0).getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest(){
        ArrayList<Pet> testPetArray = createPetArray.createPets(1);
        String expected = "Dog";
        String actual = testPetArray.get(0).getType();
        assertEquals(expected, actual);
    }
}
