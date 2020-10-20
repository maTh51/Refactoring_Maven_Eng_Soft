/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class ChildrensPrice extends Price {
    
   public int getPriceCode() {
       return Movie.CHILDRENS;
   }
   
   public double getCharge(int daysRented) {
      double result = 1.5;
      if (daysRented > 3)
         result += (daysRented - 3) * 1.5;
      return result;
   }
}