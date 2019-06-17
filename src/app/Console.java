package com.SecretCompany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Plant helper app that coordinates the watering of house plants and general information.
 *
 * @author Jake Graham
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        titleScreen();
        char op;
        ArrayList<String> plantList= new ArrayList<String>();
        do {
            op = menuOptions();
            switch (op) {
                case 'Q':
                    print("Thanks for using the app!\n");
                    break;
                case 'A':
                    addPlant(plantList);
                    break;
                case 'C':
                    plantList(plantList);
                    break;
                case 'R':
                    removePlant(plantList);
            }
           } while(op != 'Q');

    }

    private static void removePlant(List<String> plants) {
        if (plants.size() == 0) {
            print("You have no plants!");
        } else {
            plantList(plants);
            String input = prompt("Enter the name of the plant you would like to remove: ");
            if (plants.remove(input)){
                print("\"" + input + "\" has been removed successfully!");
            } else {
                print("\"" + input + "\" has not been removed successfully.");
            }
        }
    }

    private static void plantList(List<String> plants) {
        if (plants.size() == 0) {
            print("You have no plants!");
        } else {
            print("Here are your plants: \n");
            for (String plant : plants) {
               print(plant + "\n");
            }
        }
    }

    private static void addPlant(List<String> plants) {
        String newPlant = prompt("Enter the name of the Plant you would Like to add: ");
        if (plants.contains(newPlant)){
            print("List already contains " + newPlant);
        } else {
            plants.add(newPlant);
            print("\"" + newPlant + "\" has been added successfully!");
        }
    }

    private static char menuOptions() {
        print("\n(Q)uit    (A)dd a plant    (R)emove a plant    (C)urrent plants\n");
        char input = prompt("Enter the letter of your menu option: ").toUpperCase().charAt(0);
        print("\n");
        return input;

    }

    private static void titleScreen() {
        String title = " _____                    _  ______ _             _       \n" +
                "/  ___|                  | | | ___ \\ |           | |      \n" +
                "\\ `--.  ___  ___ _ __ ___| |_| |_/ / | __ _ _ __ | |_ ___ \n" +
                " `--. \\/ _ \\/ __| '__/ _ \\ __|  __/| |/ _` | '_ \\| __/ __|\n" +
                "/\\__/ /  __/ (__| | |  __/ |_| |   | | (_| | | | | |_\\__ \\\n" +
                "\\____/ \\___|\\___|_|  \\___|\\__\\_|   |_|\\__,_|_| |_|\\__|___/\n" +
                "                                                          \n";
        print(title);
    }

    public static String prompt(String text) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        print(text);
        try {
            return in.readLine();
        } catch (IOException e) {
            print("CRITICAL FAILURE");
            System.exit(0);
            return "";
        }
    }

    public static void print(String text){
        System.out.print(text);
    }


}
