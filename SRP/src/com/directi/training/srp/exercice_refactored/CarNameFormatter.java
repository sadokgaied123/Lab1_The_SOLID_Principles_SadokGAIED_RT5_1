package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.List;

public class CarNameFormatter {
    public String getCarsNames(List<com.directi.training.srp.exercise.Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2); // remove the last ", "
    }
}
