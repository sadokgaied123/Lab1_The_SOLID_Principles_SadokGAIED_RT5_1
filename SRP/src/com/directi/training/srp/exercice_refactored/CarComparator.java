package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.List;

public class CarComparator {
    public com.directi.training.srp.exercise.Car getBestCar(List<com.directi.training.srp.exercise.Car> cars) {
        com.directi.training.srp.exercise.Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
