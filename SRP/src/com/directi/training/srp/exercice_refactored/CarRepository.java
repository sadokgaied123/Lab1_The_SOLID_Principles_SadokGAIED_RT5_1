package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private List<com.directi.training.srp.exercise.Car> _carsDb = Arrays.asList(
            new com.directi.training.srp.exercise.Car("1", "Golf III", "Volkswagen"),
            new com.directi.training.srp.exercise.Car("2", "Multipla", "Fiat"),
            new com.directi.training.srp.exercise.Car("3", "Megane", "Renault")
    );

    public com.directi.training.srp.exercise.Car getFromDb(String carId) {
        for (com.directi.training.srp.exercise.Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return _carsDb;
    }
}
