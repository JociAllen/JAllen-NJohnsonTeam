/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.view;

import byui.cit230.lehisJourney.control.ProgramControl;
import byui.cit230.lehisJourney.model.Player;
import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author AllenMac
 */
public class StartProgramView {
    
    public StartProgramView() {
    
    }
    
    public void startProgram() {
       
       displayBanner();
       
       String playerName = getPlayerName();
       
       Player player = ProgramControl.createPlayer(playerName);
       
       LehisJourney.setPlayer(player);
       
       
       displayWelcomeMessage(player.getName());
       
       MainMenuView mainMenu = new MainMenuView();
       
       mainMenu.displayMenu();
       
       
    }
    
    public String getPlayerName() {
    
        boolean isValidName = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        
        while(!isValidName) {
            String input = keyboard.nextLine();
            
            if(input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                System.out.println("Input is invalid. Name must be at least two characters.");
            }
        }
        return name;
    }
    
    
    
    public void displayBanner() {
        String welcome = "";
        welcome = "======================="+
                "\n Welcome to Lehis Journey" +
                "\n May the Spirit always be you Guide!" +
                "\n =========================";
        
        
        System.out.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName){
        System.out.println("=============================");
        System.out.println("Welcome" + playerName + ",");
        System.out.println("Enjoy your Journey!");
    }
}

   

