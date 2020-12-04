package com.company.z3;

import java.util.Scanner;

public class ClientConfig {
    public static Client configClient() {
        Scanner scan = new Scanner(System.in);
        Client client = null;
        ICreateDocument iCreateDocument= null;
        System.out.println("Тип документа:");
        String name = scan.nextLine();
        switch (name) {
            case "text":
                iCreateDocument = new CreateTextDocument();
                break;
            default:
                break;
        }
        try {
            client = new Client(iCreateDocument);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
}
