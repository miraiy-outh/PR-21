package com.company.z3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Client client = new ClientConfig().configClient();
        new JMenuTest();
    }
}
