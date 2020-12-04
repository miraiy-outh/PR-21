package com.company.z1;

public class TrigComplex implements Complex {

    @Override
    public Imaginarium createIm() {
        return new TrigIm();
    }

    @Override
    public Real createReal() {
        return new TrigReal();
    }
}
