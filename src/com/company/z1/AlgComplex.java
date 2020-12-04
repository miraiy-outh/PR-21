package com.company.z1;

public class AlgComplex implements Complex {

    @Override
    public Imaginarium createIm() {
        return new AlgIm();
    }

    @Override
    public Real createReal() {
        return new AlgReal();
    }
}
