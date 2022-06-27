package by.itstep.miachyna.javalessons.lesson15.model.logic;

import by.itstep.miachyna.javalessons.lesson15.model.data.Car;

public class CarManager {
    public static int findExpensiveCar(Car car1, Car car2,
                                       Car car3, Car car4) {
        int maxPrise = car4.price;

        if (car1.price > car2.price
                && car1.price > car3.price
                && car1.price > car4.price) {
            maxPrise = car1.price;
        } else if (car2.price > car3.price
                && car2.price > car4.price) {
            maxPrise = car2.price;
        } else if (car3.price > car4.price) {
            maxPrise = car3.price;
        }
        return maxPrise;
    }

    public static int calculateTotalPrice(Car car1, Car car2,
                                          Car car3, Car car4) {

        return car1.price + car2.price + car3.price + car4.price;
    }
}
