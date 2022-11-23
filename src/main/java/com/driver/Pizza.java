package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int AddExtraCheese;
    private int AddExtraTopping;
    private int TakeAwayPrice;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isTakeAwayAdded = false;

        this.AddExtraCheese = 80;
        this.TakeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.AddExtraTopping = 70;
        }
        else{
            this.price = 400;
            this.AddExtraTopping = 120;
        }

        this.bill = "Base Price of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isExtraCheeseAdded == false){
            this.price = this.price + this.AddExtraCheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(isExtraToppingAdded == false){
            this.price = this.price + this.AddExtraTopping;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false){
            this.price = this.price + this.TakeAwayPrice;
            isTakeAwayAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            isBillGenerated = true;

            if(isExtraCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: " + this.AddExtraCheese + "\n";
            }
            if(isExtraToppingAdded == true){
                this.bill = this.bill + "Extra Toppings Added:" + this.AddExtraTopping + "\n";
            }
            if(isTakeAwayAdded == true){
                this.bill = this.bill + "Paperbag Added: " + this.TakeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
        }
        return this.bill;
    }
}
