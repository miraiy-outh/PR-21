package com.company.z1;

import java.util.Scanner;

public class EnterConfig {
    public static Enter configEnter() {
        Scanner scan = new Scanner(System.in);
        Enter enter = null;
        Complex complex = null;
        System.out.println("Форма числа:");
        String name = scan.nextLine();
        switch (name) {
            case "показательная":
                complex = new ExpComplex();
                break;
            case "тригонометрическая":
                complex = new TrigComplex();
                break;
            case "алгебраическая":
                complex = new AlgComplex();
                break;
            default:
                break;
        }
        try {
            enter = new Enter(complex);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enter;
    }
}
