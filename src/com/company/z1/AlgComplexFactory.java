package com.company.z1;

public class AlgComplexFactory implements ComplexFactory {

    @Override
    public Complex createComplex() {
        return new AlgComplex();
    }
}
