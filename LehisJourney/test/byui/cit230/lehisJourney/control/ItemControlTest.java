/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AllenMac
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test one of calcTentSize method, of class ItemControl.
     */
    @Test
    public void testCalcTentSize() {
        System.out.println("calcTentSize");
        
        /****TEST CASE #1****/
        System.out.println("\t Test case #1");
        double length = 4.0;
        double height = 5.0;
        double width = 6.0;
        ItemControl instance = new ItemControl();
        double expResult = 40.0;
        double result = instance.calcTentSize(length, height, width);
        assertEquals(expResult, result, 0.1);
        
        length = -1.0;
        height = 5.0;
        width = 6.0;
        expResult = -1.0;
        result = instance.calcTentSize(length, height, width);
        assertEquals(expResult, result, 0.1);
        
        length = 4.0;
        height = -1.0;
        width = 6.0;
        expResult = -1.0;
        result = instance.calcTentSize(length, height, width);
        assertEquals(expResult, result, 0.1);
        
        length = 4.0;
        height = 5.0;
        width = -1.0;
        expResult = -1.0;
        result = instance.calcTentSize(length, height, width);
        assertEquals(expResult, result, 0.1);
        
         length = 0.0;
        height = 5.0;
        width = -1.0;
        expResult = -1.0;
        result = instance.calcTentSize(length, height, width);
        assertEquals(expResult, result, 0.1);
    }
    public void testCalcTentsNeeded() {
        System.out.println("calcTentsNeeded");
        
        System.out.println("Test case #1");
        double inventoryItemAmount = 30.0;
        double itemGained = 20.0; 
        double dailyAmountRequired = 50.0;
        ItemControl instance = new ItemControl();
        double expResult = 0.0;
        double result = instance.calcTentsNeeded(inventoryItemAmount, itemGained, dailyAmountRequired);
        assertEquals(expResult, result, 0.1);
        
        inventoryItemAmount = 50.0;
        itemGained = 10.0; 
        dailyAmountRequired = 50.0;
        expResult = -1.0;
        result = instance.calcTentsNeeded(inventoryItemAmount, itemGained, dailyAmountRequired);
        assertEquals(expResult, result, 0.1);
        
        inventoryItemAmount = 10.0;
        itemGained = 10.0; 
        dailyAmountRequired = 50.0;
        expResult = 30.0;
        result = instance.calcTentsNeeded(inventoryItemAmount, itemGained, dailyAmountRequired);
        assertEquals(expResult, result, 0.1);
        
        inventoryItemAmount =0.0;
        itemGained = 10.0; 
        dailyAmountRequired = 50.0;
        expResult = 40.0;
        result = instance.calcTentsNeeded(inventoryItemAmount, itemGained, dailyAmountRequired);
        assertEquals(expResult, result, 0.1);
    }
}
        