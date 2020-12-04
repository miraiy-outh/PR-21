package com.company.z2;

public class MultiFabric implements Fabric{
    @Override
    public Chair createChair() {
        return new MultiChair();
    }
}
