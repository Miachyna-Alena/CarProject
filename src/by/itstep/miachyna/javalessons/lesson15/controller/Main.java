package by.itstep.miachyna.javalessons.lesson15.controller;

import by.itstep.miachyna.javalessons.lesson15.model.data.Car;
import by.itstep.miachyna.javalessons.lesson15.model.logic.CarManager;
import by.itstep.miachyna.javalessons.lesson15.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Ford";
        car1.price = 3_000;

        Car car2 = new Car();
        car2.name = "Opel";
        car2.price = 4_500;

        Car car3 = new Car();
        car3.name = "BMW";
        car3.price = 7_000;

        Car car4 = new Car();
        car4.name = "Mercedes ";
        car4.price = 6_500;

        int maxPrise = CarManager.findExpensiveCar(car1, car2, car3, car4);
        int totalPrice = CarManager.calculateTotalPrice(car1, car2, car3, car4);

        String msg = String.format("Max car price = %d$", maxPrise);
        msg += String.format("\nTotal cars price = %d$", totalPrice);

        ConsolePrinter printer = new ConsolePrinter();
        printer.print(msg);
    }
}
