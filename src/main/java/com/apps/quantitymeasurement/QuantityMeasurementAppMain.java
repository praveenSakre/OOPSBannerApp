package com.apps.quantitymeasurement;

/**
 * This class represent as main class to execute and
 * test use cases
 */
public class QuantityMeasurementAppMain {
    public static void main(String[] args) {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet3 = null;

        System.out.println(feet2.equals(null));
        System.out.println(feet1.equals(feet2));
        System.out.println(feet1==feet2);
    }
}