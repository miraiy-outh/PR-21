package com.company.z2;

public class VictorianFabric implements Fabric{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
