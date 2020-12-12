package com.ty;

public class car {

    private String model;
    private String make;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public car(){ }

    public car(String model, String make){
        this.model = model;
        this.make = make;
    }
    public car(String model, String make, int year, String color){
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public boolean hasComputer(int year) {
        // Method to check whether the car has a computer or not based on the model year
        // Cars from the year 1978 and greater have computers
        if (this.year >= 1978) {
            System.out.println("Your car has a computer!" + this.year);
            return true;
        }
        System.out.println("Your car does not have a computer!");
        return false;
    }

    public void carCompliment(String model, String make, String color) {
        System.out.println("I really like your " + this.make + " " + this.model + ", that shade of " + this.color + " is really nice!");
    }

    public static void main(String[] args){
        car myCarVar = new car("Mustang","Ford",1977,"Green");

        myCarVar.hasComputer(myCarVar.year);
        myCarVar.carCompliment(myCarVar.model,myCarVar.make,myCarVar.color);
    }

}
