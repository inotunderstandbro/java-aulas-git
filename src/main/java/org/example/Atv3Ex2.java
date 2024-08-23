package org.example;

import java.util.Scanner;

public class Atv3Ex2 {//programa

    public static void main(String[] args) {//inicio
        int cont, x, res;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número que deseja obter a tabuada da multiplicação:");
        x = ler.nextInt();
        System.out.println("TABUADA DO " + x);
        for(cont = 1; cont <=10; cont++){
            res = cont * x;
            System.out.println(cont + " X " + x + " = " + res);
            //escreva(cont," X ",x," = ",res,"\n")
        }
    }
}