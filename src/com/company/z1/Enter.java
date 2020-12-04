package com.company.z1;


public class Enter {
    private Imaginarium im;
    private Real real;
    public Enter(Complex complex) {

        im = complex.createIm();
        real = complex.createReal();
    }

    public void write() {
        im.write();
        real.write();
    }
}
