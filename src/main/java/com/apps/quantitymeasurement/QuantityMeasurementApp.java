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

    /**
     * QuantityMeasurementApp - UC2: Feet mesurement quality
     *
     * This class is responsible for checking the quality of two numericc
     * values measurement in feet in the Quantity measurement Application
     */
    public static class Inches {
        /**
         * represent Inches class instance variables
         */
        private final double value;

        /**
         * Constructor to intialize instance variables
         * @param value
         */
        public Inches(double value) {
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

            Inches inches = (Inches) object;

            return Double.compare(this.value, inches.value) == 0;
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

    /**
     * Static method to compare Feet to inch objects values
     * @param feet
     * @param inches
     * @return
     */
    private static boolean compareFeetAndInches(Feet feet, Inches inches) {
        return Double.compare(feet.value * 12, inches.value) == 0;
    }

    /**
     * Static methods for demonstrate Feet Equality
     */
    public static void demonstrateFeetEquality() {
        Feet first = new Feet(1.0);
        Feet second = new Feet(1);
        System.out.println("Equal ("+ first.equals(second) + ")");
    }

    /**
     * Static methods for demonstrate Inches Equality
     */
    public static void demonstrateInchesEquality() {
        Inches first = new Inches(1);
        Inches second = new Inches(1);
        System.out.println("Equal ("+ first.equals(second)+")");
    }

    /**
     * Static method to check feet to inches equality
     */
    public static void demonstrateFeetToInchesEquality() {
        Feet feet = new Feet(1456.899);
        Inches inches = new Inches(17482.788);
        System.out.println("Equal ("+compareFeetAndInches(feet,inches)+")");
    }

    /**
     * Uc3 implementation
     * Static method to check length equality
     * @param length1
     * @param length2
     * @return
     */

    public static boolean demonstrateLengthEquality(Length length1, Length length2) {
        return length1.equals(length2);
    }


    /**
     * Static method to check length feet equality
     */
    public static void demonstrateLengthFeetEquality() {
        Length feet1 = new Length(12, LengthUnit.FEET);
        Length feet2 = new Length(12, LengthUnit.FEET);
        System.out.println("Equal ("+demonstrateLengthEquality(feet1,feet2)+")");
    }

    /**
     * Static method to check Length inches equality
     */
    public static void demonstrateLengthInchesEquality() {
        Length inches1 = new Length(12, LengthUnit.INCHES);
        Length inches2 = new Length(12, LengthUnit.INCHES);
        System.out.println("Equal ("+demonstrateLengthEquality(inches1,inches2)+")");
    }

    /**
     * static method to check feetTOInches comparison
     */
    public static void demonstrateLengthFeetInchesComparison() {
        Length feet = new Length(12, LengthUnit.FEET);
        Length inches = new Length(144, LengthUnit.INCHES);
        System.out.println("Equal ("+demonstrateLengthEquality(feet,inches)+")");
    }

    /**
     * method to check yardtoInches comparison
     */
    public static void demonstrateLengthYardsInchesComparison() {
        Length length = new Length(1.0, LengthUnit.YARDS);
        Length lengthInches = new Length(36, LengthUnit.INCHES);
        System.out.println("Equal ("+demonstrateLengthEquality(length,lengthInches)+")");
    }

    /**
     * Static method to check centimeter to inches comparison
     */
    public static void demonstrateLengthCentimeterInchesComparison() {
        Length length = new Length(100.0, LengthUnit.CENTIMETERS);
        Length lengthInches = new Length(39.3701, LengthUnit.INCHES);
        System.out.println("Equal ("+demonstrateLengthEquality(length,lengthInches)+")");
    }
    /**
     * main method to demonstrate Inches , Feet, feet-to-inches Equality check
     * @param args
     */
    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetToInchesEquality();

        // Uc3 implementation
        demonstrateLengthFeetEquality();
        demonstrateLengthInchesEquality();
        demonstrateLengthFeetInchesComparison();

        // uc4
        demonstrateLengthYardsInchesComparison();
        demonstrateLengthCentimeterInchesComparison();
    }
}
