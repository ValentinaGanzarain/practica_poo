package src;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate ;

    public Double getTotaltoPay(){
        return price + tax;
    }

    public void calculateTax(){
        tax = price * 0.19;
    }

    public boolean canitBeSold(Date expiration) {
        Date today = new Date();
        if (expiration.after(today)) {
            return false;
        } else {
            return true;
        }
    }
}
