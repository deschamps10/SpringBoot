package com.senai.conversor.dtos;

public class ConversorDTO {

    private String UnitOrigin;
    private String destinationOrigin;
    private float value;

    public ConversorDTO() {}

    public String getUnitOrigin() {
        return UnitOrigin;
    }

    public void setUnitOrigin(String unitOrigin) {
        UnitOrigin = unitOrigin;
    }

    public String getDestinationOrigin() {
        return destinationOrigin;
    }

    public void setDestinationOrigin(String destinationOrigin) {
        this.destinationOrigin = destinationOrigin;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
