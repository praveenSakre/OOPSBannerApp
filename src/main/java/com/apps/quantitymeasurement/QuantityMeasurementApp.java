package com.apps.quantitymeasurement;

import java.util.Objects;

/**
 * QuantityMeasurementApp - UC1: Feet mesurement quality
 *
 * This class is responsible for checking the quality of two numericc
 * values measurement in feet in the Quantity measurement Application
 */
public class QuantityMeasurementApp {
    /**
     * Inner class to represent Feet measurement
     */
    public static class Feet {
        /**
         * represent Feet class instance variables
         */
        private final double value;

        /**
         * Constructor to intialize instance variables
         * @param value
         */
        public Feet(double value) {
            this.value = value;
        }

        /**
         * Compare two Feet class objects
         * @param object
         * @return
         */
        @Override
        public boolean equals(Object object) {
            if(this == object)
                 return true;

            if(object == null || this.getClass() != object.getClass())
                return false;

            Feet feet = (Feet) object;
            return Double.compare(this.value, feet.value) == 0;
        }

        /**
         * represent hascode of object
         * @return
         */
        @Override
        public int hashCode() {
            return Objects.hashCode(value);
        }
    }
}
