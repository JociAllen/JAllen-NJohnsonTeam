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
public class TentControlView {
    public TentControlView() {
    
    }
   
    public void getPlayerName() {
    
        boolean isValidSize = false;
        String size = "";
        Scanner keyboard = new Scanner(System.in);
        
        
        
        System.out.println("The tent's volume needs to be 50 or less. Please enter a length, width and height.");
        
        //(I can't remember how to set this up)  ItemControl.ic = itemControl;
        
            while(!isValidSize) {
            String input = keyboard.nextLine();
            
            if(input.calcTentSize()) {
                isValidSize = true;
               
            } else {
                System.out.println("The tent is the wrong size. Try again. ");
            }
        }
    }
    

}

