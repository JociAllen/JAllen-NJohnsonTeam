/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.control;

/**
 *
 * @author AllenMac
 */
public class ItemControl {
   public double calcTentSize(double length, double height, double width){ 
       if(height < 0 || width < 0 || length < 0){
           return -1;}
      
       double totalMult = (length * height * width);
               
      return totalMult/3;        
    }
  
   double calcTentsNeeded(double inventoryItemAmount, double itemGained, double dailyAmountRequired){
       if(inventoryItemAmount >= 50 || (itemGained+inventoryItemAmount) >=50){
           return -1;}
       
       double totalAdd = (inventoryItemAmount + itemGained);
       dailyAmountRequired = 50; 
       double amountNeeded = dailyAmountRequired - totalAdd;
       
       return amountNeeded;
   }
}


