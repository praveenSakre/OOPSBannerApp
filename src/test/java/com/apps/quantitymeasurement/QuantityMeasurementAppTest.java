package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

    /**
     * Test feet equality
     */
    @Test
    public void testFeetEquality() {
        boolean expected = true;
        Length feet1 = new Length(12, LengthUnit.FEET);
        Length feet2 = new Length(12, LengthUnit.FEET);
        Assertions.assertEquals(expected, QuantityMeasurementApp.demonstrateLengthEquality(feet1, feet2));
    }

    /**
     * Test inches equality
     */
    @Test
    public void testInchesEquality() {
        boolean expected = true;
        Length inches1 = new Length(12, LengthUnit.INCHES);
        Length inches2 = new Length(12, LengthUnit.INCHES);
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(inches1, inches2));
    }

    /**
     * Test feet To inches comparison
     */
    @Test
    public void testFeetInchesComparison() {
        boolean expected = true;
        Length feet = new Length(3, LengthUnit.FEET);
        Length inches = new Length(36, LengthUnit.INCHES);
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(feet, inches));
    }

    /**
     * Test Feet in equality
     */
    @Test
    public void testFeetInequality() {
        boolean expected = false;
        Length feet1 = new Length(12, LengthUnit.FEET);
        Length feet2 = new Length(20, LengthUnit.FEET);
        Assertions.assertEquals(expected, QuantityMeasurementApp.demonstrateLengthEquality(feet1, feet2));
    }

    /**
     * Test inches in equality
     */
    @Test
    public void testInchesInequality() {
        boolean expected = false;
        Length inches1 = new Length(50, LengthUnit.INCHES);
        Length inches2 = new Length(12, LengthUnit.INCHES);
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(inches1, inches2));
    }

    /**
     * Test cross unit In equality
     */
    @Test
    public void testCrossUnitInquality() {
        boolean expected = false;
        Length feet = new Length(21, LengthUnit.FEET);
        Length inches = new Length(36, LengthUnit.INCHES);
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(feet, inches));
    }

    /**
     * Test multiple feet comparison
     */
    @Test
    public void testMultipleFeetComparison() {
        boolean expected =  true;
        Length feet1 = new Length(21, LengthUnit.FEET);
        Length feet2 = new Length(21, LengthUnit.FEET);
        Length feet3 = new Length(79, LengthUnit.FEET);
        Length feet4 = new Length(79, LengthUnit.FEET);
        Length feet5 = new Length(51.5, LengthUnit.FEET);
        Length feet6 = new Length(51.5, LengthUnit.FEET);

        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(feet1, feet2));
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(feet3, feet4));
        Assertions.assertEquals(expected,
                QuantityMeasurementApp.demonstrateLengthEquality(feet5, feet6));
    }

    /**
     * Test yard to Yards equality with same value
     */
    @Test
    public void testEquality_YardTotard_samevalue() {
        boolean expected = true;
        Length yard1 = new Length(1.0, LengthUnit.YARDS);
        Length yard2 = new Length(1.0, LengthUnit.YARDS);
        Assertions.assertEquals(expected, yard1.equals(yard2));
    }

    /**
     * Test yard to yard with different value
     */
    @Test
    public void testEquality_YardToYard_DifferentValue() {
        boolean expected = false;
        Length yard1 = new Length(1.0, LengthUnit.YARDS);
        Length yard2 = new Length(2.0, LengthUnit.YARDS);
        Assertions.assertEquals(expected, yard1.equals(yard2));
    }

    /**
     * Test yard to feet equivalent value
     */
    @Test
    public void testEquality_YardToFeet_EquivalentValue() {
        boolean expected = true;
        Length yards = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);
        Assertions.assertEquals(expected, yards.equals(feet));
    }

    /**
     * Test feet to yards equivalent value
     */
    @Test
    public void testEquality_FeetToYard_EquivalentValue() {
        boolean expected = true;
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length yards = new Length(1.0, LengthUnit.YARDS);
        Assertions.assertEquals(expected, feet.equals(yards));
    }

    /**
     * Test yards to inches with equivalent value
     */
    @Test
    public void testEquality_YardToInches_EquivalentValue() {
        boolean expected = true;
        Length yards = new Length(1.0, LengthUnit.YARDS);
        Length inches = new Length(36.0, LengthUnit.INCHES);
        Assertions.assertEquals(expected, yards.equals(inches));
    }

    /**
     * Test Inches to yards equivalent value
     */
    @Test
    public void testEquality_InchesToYards_EquivalentValue() {
        boolean expected = true;
        Length inches = new Length(36.0, LengthUnit.INCHES);
        Length yards = new Length(1.0, LengthUnit.YARDS);
        Assertions.assertEquals(expected, inches.equals(yards));
    }

    /**
     * Test yards to feet non equivalent value
     */
    @Test
    public void testEquality_YardsToFeet_NonEquivalentValue() {
        boolean expected = false;
        Length yards = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(2.0, LengthUnit.FEET);
        Assertions.assertEquals(expected, yards.equals(feet));
    }

    /**
     * test centimeter to inches with equivalent values
     */
    @Test
    public void testEquality_centimeterToInches_EquivalentValue() {
        boolean expected = true;
        Length centimeters = new Length(1.0, LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, LengthUnit.INCHES);
        Assertions.assertEquals(expected, centimeters.equals(inches));
    }

    /**
     * Test centimeter to feet non equivalent value
     */
    @Test
    public void testEquality_centimeterToFeet_NonEquivalentValue() {
        boolean expected = false;
        Length centimeters = new Length(1.0, LengthUnit.CENTIMETERS);
        Length feet = new Length(1.0, LengthUnit.FEET);
        Assertions.assertEquals(expected, centimeters.equals(feet));
    }

    /**
     * Test multi units transitive property equality
     */
    @Test
    public void testEquality_MultiUnit_TransitiveProperty() {
        boolean expected = true;
        Length yard1 = new Length(1.0, LengthUnit.YARDS);
        Length feet1 = new Length(3.0, LengthUnit.FEET);

        Length feet2 = new Length(3.0, LengthUnit.FEET);
        Length inches = new Length(36.0, LengthUnit.INCHES);

        Length yards = new Length(1.0, LengthUnit.YARDS);
        Length inches1 = new Length(36.0, LengthUnit.INCHES);

        Assertions.assertEquals(expected, yard1.equals(feet1));
        Assertions.assertEquals(expected, feet2.equals(inches));
        Assertions.assertEquals(expected, yards.equals(inches1));
    }

    /**
     * Test yard with null object equality
     */
    @Test
    public void testEquality_yardWithNullUnit() {
        boolean expected = false;

        Length yards1 = new Length(1.0, LengthUnit.YARDS);
        Length yards2 = null;

        Assertions.assertEquals(expected, yards1.equals(yards2));
    }

    /**
     * Test yard same reference equality
     */
    @Test
    public void testEquality_YardSameReference() {
        boolean expected = true;

        Length yards = new Length(1.0, LengthUnit.YARDS);

        Assertions.assertEquals(expected, yards.equals(yards));
    }

    /**
     * Test Yard with null value comparison
     */
    @Test
    public void testEquality_YardNullComparison() {
        boolean expected = false;

        Length yards = new Length(1.0, LengthUnit.YARDS);

        Assertions.assertEquals(expected, yards.equals(null));
    }

    /**
     * Test centimeter with null equality
     */
    @Test
    public void testEquality_CentimetersWithNullUnit() {
        boolean expected = false;

        Length centimeters = new Length(1.0, LengthUnit.CENTIMETERS);

        Assertions.assertEquals(expected, centimeters.equals(null));
    }

    /**
     * Test centimeter same refrence equality
     */
    @Test
    public void testEquality_CentimetersSameReference() {
        boolean expected = true;

        Length centimeters = new Length(1.0, LengthUnit.CENTIMETERS);

        Assertions.assertEquals(expected, centimeters.equals(centimeters));
    }

    /**
     * Test centimeter null comparison
     */
    @Test
    public void testEquality_CentimetersNullComparison() {
        boolean expected = false;

        Length centimeters = new Length(1.0, LengthUnit.CENTIMETERS);
        Length centimeters1 = null;
        Assertions.assertEquals(expected, centimeters.equals(centimeters1));
    }

    /**
     * Test All units complex scenario
     */
    @Test
    public void testEquality_AllUnits_ComplexScenario() {
        boolean expected = true;

        Length yards = new Length(2.0, LengthUnit.YARDS);
        Length feet = new Length(6.0, LengthUnit.FEET);
        Length inches = new Length(72.0, LengthUnit.INCHES);

        Assertions.assertEquals(expected, yards.equals(feet));
        Assertions.assertEquals(expected, feet.equals(inches));
    }
}
