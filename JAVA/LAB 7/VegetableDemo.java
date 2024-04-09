//The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.

import java.util.Scanner;

abstract class Vegetable {
    String colour;
    Vegetable(String colour) {
        this.colour = colour;
    }

    abstract String getName();

    public String toString() {
        return (getName() + ":" + "Colour:" + colour);
    }
}

class Potato extends Vegetable {

    Potato(String colour) {
        super(colour);
    }

    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {

    Brinjal(String colour) {
        super(colour);
    }

    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    Tomato(String colour) {
        super(colour);
    }

    public String getName() {
        return "Tomato";
    }
}

public class VegetableDemo {

    public static void main(String[] args) {
        Potato p1 = new Potato("brown");

        Brinjal b1 = new Brinjal("purple");

        Tomato t1 = new Tomato("Red");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter \n1 for Potato \n2 for Brinjal \n3 for Tomato");
        // int a = sc.nextInt();

        // if (a==1) {
        //     System.out.println("Vegetable Potato\nColour is Brown");
        // }
        // else if (a==2) {
        //     System.out.println("Vegetable Brinjal\nColour is Purple");
        // }
        // else if(a==3){
        //     System.out.println("Vegetable Tomato\nColour is Red");
        // }
        // else{
        //     System.out.println("Give Valid input");
        // }

        System.out.println(p1);
        System.out.println(b1);
        System.out.println(t1);
    }
}