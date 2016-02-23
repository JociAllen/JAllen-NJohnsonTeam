/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisjourney;

import byui.cit230.lehisJourney.model.Player;
import byui.cit230.lehisJourney.view.StartProgramView;

/**
 *
 * @author AllenMac
 */
public class LehisJourney {
    
    private static Player player;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
        Player playerOne = new Player();
        
        playerOne.setName("Nephi");
        playerOne.setBestTime (7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
    StartProgramView startProgram = new StartProgramView();
    startProgram.startProgram();
        
    }

    public static void setPlayer(Player p) {
       player = p; 
    }
    
    
    
    
}
