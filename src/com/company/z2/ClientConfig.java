package com.company.z2;

import java.util.Scanner;

public class ClientConfig {
    public static Client configClient() {
        Scanner scan = new Scanner(System.in);
        Client client = null;
        Fabric fabric = null;
        System.out.println("Вид стула:");
        String name = scan.nextLine();
        switch (name) {
            case "викторианский":
                fabric = new VictorianFabric();
                break;
            case "магический":
                fabric = new MagicFabric();
                break;
            case "мультифункциональный":
                fabric = new MultiFabric();
                break;
            default:
                break;
        }
        try {
            client = new Client(fabric);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
}
