package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePetArray {
    private Console myConsole;
    private Scanner scanner;
    private CheckIfValidPet check = new CheckIfValidPet();
    private GeneratePetObjects makePets = new GeneratePetObjects();
    private ArrayList<Pet> petList = new ArrayList<>();

    public CreatePetArray(Console console, Scanner scanner){
        myConsole = console;
        this.scanner = scanner;

    }
    public ArrayList<Pet> createPets(Integer numPets) {
        if (numPets < 0) {
            myConsole.youHaveANoPetsZone();
        }

        while (numPets > 0) {
            for (int i = 0; i < numPets; i++) {
                myConsole.askForPetType();
                String petType = scanner.next().toLowerCase();
                if (check.checkPet(petType).equals("invalid")) {
                    i--;
                    myConsole.enterValidPet();
                } else {
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petList.add(makePets.makePet(petType, petName));
                    numPets--;
                }

            }
        }
        return petList;
    }
}
