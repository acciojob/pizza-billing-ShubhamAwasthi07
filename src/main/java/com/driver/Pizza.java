package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            System.out.println("Base Price Of The Pizza:" + 300 + "\n");
            this.price = price + 300;
        }
        else {
            System.out.println("Base Price Of The Pizza:" + 400 + "\n");
            this.price = price + 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price = 80 + price;
        System.out.println("Extra Cheese Added: " + 80 + "\n");
    }

    public void addExtraToppings(){
        // your code goes here
        this.price =  70 + price;
        System.out.println("Extra Toppings Added: " + 70 + "\n");
    }

    public void addTakeaway(){
        // your code goes here
        this.price = 20 + price;
        System.out.println("Paperbag Added: " + 20 + "\n");

    }

    public String getBill(){
        // your code goes here
        bill = String.valueOf(price);
        return this.bill;
    }
}
