package uk.ac.westminster.products_api;

public class Activity2 {
    static void main() {
        int quantity=3;
        double unitPrice=24.99;
        String name="Wireless Mouse";
        boolean inStock=true;

        double total= calculatetotal(quantity,unitPrice);
        System.out.println("Price of " +name+" in Pound is : "+ total);
    }
    public static double calculatetotal(int qty, double unitprice){
        return qty*unitprice;
    }
}
