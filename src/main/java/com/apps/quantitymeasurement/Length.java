package com.apps.quantitymeasurement;

import java.util.Objects;

/**
 * Length class to represent length measurements along with their enum units
 */
public class Length {
    /**
     * Instance variables
     *
     */
    private final double value;
    private final LengthUnit unit;

    /**
     * constructor to initialize length value and unit
     * @param value
     * @param unit
     */
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * convert the length value to the base unit.
     * @param length
     * @return
     */
    private double convertToBaseUnit(Length length) {
        if(!length.unit.equals(LengthUnit.FEET))
            return (length.value / LengthUnit.FEET.getConversionFactor());
        return length.value;
    }

    /**
     * convert two length objects for equality based on their values in the base unit.
     * @param thatLength
     * @return
     */
    public boolean compare(Length thatLength) {
        return Double.compare(convertToBaseUnit(this), convertToBaseUnit(thatLength)) == 0;
    }

    /**
     * Equality check for two length objects
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return  true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Length length = (Length) obj;
        return this.compare(length);
    }

    /**
     * represent Object hashcode value.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
