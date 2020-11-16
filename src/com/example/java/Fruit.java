package com.example.java;

public class Fruit {
    private String type;
    private String color;
    private boolean isTart;

    public Fruit() {

    }

    public Fruit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Fruit(String type, String color, boolean isTart) {
        this.type = type;
        this.color = color;
        this.isTart = isTart;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTart() {
        return isTart;
    }

    public void setTart(boolean tart) {
        isTart = tart;
    }

    public void printData(String str) {
        System.out.print(str +  " is a type of " + this.type + " that is " + this.color  + " and ");
        if (this.isTart) {
            System.out.print("tart.\n");
        } else {
            System.out.print("not tart.\n");
        }
    }

    public static boolean isSameType(Fruit f1, Fruit f2) {
        return f1.getType() == f2.getType();
    }

    public static void main(String[] args) {
        Fruit grannySmith = new Fruit("apple", "green", true);
        Fruit bartlett = new Fruit("pear", "yellow", false);
        grannySmith.printData("Granny Smith");
        bartlett.printData("Bartlett");
        boolean sameFruitType = Fruit.isSameType(grannySmith, bartlett);
    }
}
