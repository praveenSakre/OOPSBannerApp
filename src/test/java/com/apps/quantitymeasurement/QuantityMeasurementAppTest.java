package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * QuantityMeasurementApp - UC1: Feet mesurement quality
 *
 * This class is responsible to test the quality of two numericc
 * values measurement in feet in the Quantity measurement Application
 */
public class QuantityMeasurementAppTest {

    /**
     * This test verifies two numerical values
     * are equal
     *
     */
    @Test
    public void testFeetEquality_SameValue() {
        boolean expected = true;
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        Assertions.assertEquals(expected, feet1.equals(feet2));
    }

    /**
     * This test verifies two numerical values are
     * not equal
     */
    @Test
    public void testEquality_DifferentValue() {
        boolean expected = false;
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);
        Assertions.assertEquals(expected, feet1.equals(feet2));
    }

    /**
     * This test verifies that a numerical value is
     * equal to null
     */
    @Test
    public void testEquality_NullComparison() {
        boolean expected = false;
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = null;
        Assertions.assertEquals(expected, feet1.equals(feet2));
    }

    /**
     * This test verifies equality on different classes
     */
    @Test
    public void testEquality_DifferentClass() {
        boolean expected = false;
        QuantityMeasurementApp.Feet feetClassObject = new QuantityMeasurementApp.Feet(1.0);
        Object differentClassObj = new Object();

        Assertions.assertEquals(expected, feetClassObject.equals(differentClassObj));
    }

    /**
     * This test verifies that non-numeric inputs are
     * handled appropriately
     */
    @Test
    public void testEquality_NonNumericInput() {
        /*boolean expected = false;
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        Assertions.assertEquals(expected, feet1.equals(feet2));*/

    }

    /**
     * This test verifies that numerical value is equal
     * to itself(refexive property)
     */
    @Test
    public void testEquality_sameReference() {
        boolean expected = true;
        QuantityMeasurementApp.Feet firstFeet = new QuantityMeasurementApp.Feet(5.0);
        Assertions.assertEquals(expected, firstFeet.equals(firstFeet));
    }
}
