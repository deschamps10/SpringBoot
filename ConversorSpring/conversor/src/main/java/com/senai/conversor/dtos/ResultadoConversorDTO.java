package com.senai.conversor.dtos;

public class ResultadoConversorDTO {

    private String destinationOrigin;
    private Float result;

    public ResultadoConversorDTO() {}

    public String getDestinationOrigin() {
        return destinationOrigin;
    }

    public void setDestinationOrigin(String destinationOrigin) {
        this.destinationOrigin = destinationOrigin;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }
}
