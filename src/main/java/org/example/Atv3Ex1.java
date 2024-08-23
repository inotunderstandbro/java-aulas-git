package org.example;

 import java.util.Scanner;

public class Atv3Ex1 {

    public static void main(String[] args) {//inicio

        int realx = 0;
        int soma = 0;
        int cont = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número você deseja somar");
        realx = ler.nextInt();
        soma += realx;
        System.out.println("O somatório é: "+ soma);
    }

}