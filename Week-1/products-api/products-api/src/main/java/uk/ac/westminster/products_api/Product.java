package uk.ac.westminster.products_api;

public class Product {
     Long id;
     String name;
     double price;

    //Constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String describe() {
        if (price > 100) {
            return "Name: " + name + " ,Price: " + price + ", -premium";
        } else {
            return "Name: " + name + " ,Price: " + price + ", -standard";
        }
    }
}


