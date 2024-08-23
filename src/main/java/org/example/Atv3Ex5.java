package org.example;

import java.util.Scanner;

public class Atv3Ex5 {
    public static void main(String[] args) {//inicio

        int anos = 0;
        double alt_Chico = 1.5;
        double alt_Ze = 1.10;
        while (alt_Chico > alt_Ze) {
            anos++;
            alt_Chico += 0.2;
            alt_Ze += 0.3;
            //Scanner ler = new Scanner(System.in);
            System.out.println("Serão necessários " + anos + " para que Zé seja maior que Chico");


        }
    }
}
