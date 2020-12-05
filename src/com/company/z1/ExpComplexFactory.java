package com.company.z1;

public class ExpComplexFactory implements ComplexFactory {

    @Override
    public Complex createComplex() {
        return new ExpComplex();
    }
}
