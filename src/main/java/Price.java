/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);
    
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE)   &&
            daysRented > 1) frequentRenterPoints ++;
     
        return frequentRenterPoints;
    }

}