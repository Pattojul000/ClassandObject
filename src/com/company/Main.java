package com.company;

public class Main {

    public static void main(String[] args) {
	    //Create a new car with Make, Model, and Year Constructor
        Car car1 = new Car("Chevy", "Camaro", 1977);
        //Make a new car with Default Constructor
        Car car2 = new Car();

        System.out.println(car1.getYear() + " " + car1.getMake() + " " + car1.getModel());
        System.out.println(car2.getYear() + " " + car2.getMake() + " " + car2.getModel());

    }
}
