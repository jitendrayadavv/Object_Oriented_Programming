package uk.ac.westminster.products_api;

public class Activity3 {
    static void main() {
        String [] fruits= {"apple","banana","orange","mango"};
        double[] price={11,13,15,17};

        double catalogueTotal=0;

        for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i] +" : " + price[i]);
            catalogueTotal+=price[i];
            if(price[i]>=100){
                System.out.println(fruits[i]+" premium "+ price[i]);
            }else{
                System.out.println(fruits[i] + " standard " + price[i]);
            }
        }
        System.out.println(catalogueTotal);

    }
}
