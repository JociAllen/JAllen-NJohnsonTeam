/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.model;

/**
 *
 * @author AllenMac
 */
public class Map {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    
    private final Location[][] matrix;
    
    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
    }
    
    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }
}