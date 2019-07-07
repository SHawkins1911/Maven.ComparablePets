package io.zipcoder;

import java.util.ArrayList;

public class GeneratePetObjects {
    ArrayList<Pet> petList = new ArrayList<>();

    public Pet makePet(String petType, String petName){
        switch (petType){
            case "dog":
                return new Dog(petName);

            case "cat":


                return new Cat(petName);

            case "frog":
                return new Frog(petName);

            }
        return null;
    }
}
