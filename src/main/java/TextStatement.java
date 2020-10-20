/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String Header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() +
        "\n";
    }
    
    public String Middle(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" +
           String.valueOf(each.getCharge()) + "\n";
    }
    
    public String Footer(Customer aCustomer) {
        //add footer lines
        String aux = "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n";
        
        aux += "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
        
        return aux;
    }
}