package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        Console myConsole = new Console();
        Scanner scanner = new Scanner(System.in);
        CreatePetArray myPets = new CreatePetArray(myConsole, scanner);
        ArrayList<Pet> petList;
        SortingArray sorted = new SortingArray();

        petList = myPets.createPets(myConsole.askHowManyPets());

        System.out.println("Pet team roll call");
        myConsole.printList(petList);
        System.out.println("The list is sorted below by type then by name");
        myConsole.printList(sorted.sortTheArray(petList));


    }

}


