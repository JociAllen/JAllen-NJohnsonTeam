/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.view;

import java.util.Scanner;

/**
 *
 * @author AllenMac
 */
public class GameView {
        private final String menu = "\n"
            + "\n P - Play"
            + "\n T - Tent Build"
            + "\n G - Gather"
            + "\n S - Shoot/Hunt"
            + "\n H - Help"
            + "\n M - Main Menu"
            + "\n Q - Quit";


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
