package com.apps.quantitymeasurement;

/**
 * This enum represents different length units and their conversion
 */
public enum LengthUnit {
    FEET(12),
    INCHES(1),
    YARDS(36),
    CENTIMETERS(0.393701);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return  conversionFactor;
    }
}
