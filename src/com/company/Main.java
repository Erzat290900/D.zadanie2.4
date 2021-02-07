package com.company;

public class Main {

    public static void main(String[] args) {
        Garage<Car> bmwGarage = new Garage<>();
        bmwGarage.addMileage(new Bmw(2, Color.BLACK));
        Garage<Car> mersGarage = new Garage<>();
        mersGarage.addMileage(new Mers(2000, Color.BLUE));
        Garage<Car> passatGarage = new Garage<>();
        passatGarage.addMileage(new Passat(1989, Color.SILVER));


    }


}
