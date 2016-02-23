/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.control;

import byui.cit230.lehisJourney.model.Player;

/**
 *
 * @author AllenMac
 */
public class ProgramControl {
   
    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
        
    }
}
