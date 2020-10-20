
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
import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = Header(aCustomer);
        
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for this rental
           result += Middle(each);
        }
        
        result += Footer(aCustomer);
        
        return result;
    }

    abstract String Header(Customer aCustomer);
    
    abstract String Middle(Rental each);
    
    abstract String Footer(Customer aCustomer);
}
