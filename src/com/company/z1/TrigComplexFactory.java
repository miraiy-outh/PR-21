package com.company.z1;

public class TrigComplexFactory implements ComplexFactory {

    @Override
    public Complex createComplex() {
        return new TrigComplex();
    }
}
