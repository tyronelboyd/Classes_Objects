package com.ty;

public class pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public static void main(String[] args){
        pet myPetVar = new pet("buddy",2,"florida","golden retriever");
        System.out.print(myPetVar.name);
    }

    public pet(){

    }

    public pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

}

