package com.company.z1;

public class ExpComplex implements Complex{
    @Override
    public Imaginarium createIm() {
        return new ExpIm();
    }

    @Override
    public Real createReal() {
        return new ExpReal();
    }
}
