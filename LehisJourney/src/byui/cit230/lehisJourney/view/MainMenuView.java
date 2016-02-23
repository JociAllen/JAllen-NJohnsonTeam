/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.view;

/**
 *
 * @author AllenMac
 */
import java.util.Scanner;

public class MainMenuView {

    private final String menu = "\n"
            + "\n N -  Start new game"
            + "\n L - Load saved game"
            + "\n S - Save current game"
            + "\n H - Help menu"
            + "\n Q - Quit";

    public MainMenuView() {

    }

    public void displayMenu() {

        char selection = ' ';

        do {
            System.out.println(menu);

            String input = getInput();
            selection = input.charAt(0);

        } while (selection != 'Q');

    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            //System.out.println("Invalid input. Please enter a valid character.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input == null || input.length() == 0) {

            } else {
                isValid = true;
            }
        }

        return input;
    }
}
