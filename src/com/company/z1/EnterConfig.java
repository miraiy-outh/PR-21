package com.company.z1;

import java.util.Scanner;

public class EnterConfig {
    public static Enter configEnter() {
        Scanner scan = new Scanner(System.in);
        Enter enter = null;
        ComplexFactory complexFactory = null;
        System.out.println("Форма числа:");
        String name = scan.nextLine();
        switch (name) {
            case "показательная":
                complexFactory = new ExpComplexFactory();
                break;
            case "тригонометрическая":
                complexFactory = new TrigComplexFactory();
                break;
            case "алгебраическая":
                complexFactory = new AlgComplexFactory();
                break;
            default:
                break;
        }
        try {
            enter = new Enter(complexFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enter;
    }
}
