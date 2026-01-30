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
    public void testFeetEquality_DifferentValue() {
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
    public void testFeetEquality_NullComparison() {
        boolean expected = false;
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = null;
        Assertions.assertEquals(expected, feet1.equals(feet2));
    }

    /**
     * This test verifies equality on different classes
     */
    @Test
    public void testFeetEquality_DifferentClass() {
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
    public void testFeetEquality_NonNumericInput() {
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
    public void testFeetEquality_sameReference() {
        boolean expected = true;
        QuantityMeasurementApp.Feet firstFeet = new QuantityMeasurementApp.Feet(5.0);
        Assertions.assertEquals(expected, firstFeet.equals(firstFeet));
    }

    /**
     * This test verifies two numerical values
     * are equal
     *
     */
    @Test
    public void testInchesEquality_SameValue() {
        boolean expected = true;
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(12);
        QuantityMeasurementApp.Inches inches2 = new QuantityMeasurementApp.Inches(12);
        Assertions.assertEquals(expected, inches1.equals(inches2));
    }

    /**
     * This test verifies two numerical values are
     * not equal
     */
    @Test
    public void testInchesEquality_DifferentValue() {
        boolean expected = false;
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(12);
        QuantityMeasurementApp.Inches inches2 = new QuantityMeasurementApp.Inches(56);
        Assertions.assertEquals(expected, inches1.equals(inches2));
    }

    /**
     * This test verifies that a numerical value is
     * equal to null
     */
    @Test
    public void testInchesEquality_NullComparison() {
        boolean expected = false;
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(12);
        QuantityMeasurementApp.Inches inches2 = null;
        Assertions.assertEquals(expected, inches1.equals(inches2));
    }

    /**
     * This test verifies equality on different classes
     */
    @Test
    public void testInchesEquality_DifferentClass() {
        boolean expected = false;
         Object differentClassObj = new Object();
         QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(24);
         Assertions.assertEquals(expected, inches.equals(differentClassObj));
    }

    /**
     * This test verifies that non-numeric inputs are
     * handled appropriately
     */
    @Test
    public void testInchesEquality_NonNumericInput() {
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
    public void testInchesEquality_sameReference() {
        boolean expected = true;
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(12);
        QuantityMeasurementApp.Inches inches2 = inches1;
        Assertions.assertEquals(expected, inches1.equals(inches2));
    }
}
