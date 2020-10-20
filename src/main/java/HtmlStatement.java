
import java.util.Enumeration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class HtmlStatement extends Statement {
    
    public String Header(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
    }
    
    public String Middle(Rental each) {
        return each.getMovie().getTitle()+ ": " +
           String.valueOf(each.getCharge()) + "<BR>\n";
    }
    
    public String Footer(Customer aCustomer) {
        //add footer lines
        String aux = "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        
        aux += "On this rental you earned <EM>" + 
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
        
        return aux;
    }
}
