package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o 1º valor: ");
        a = scan.nextInt();
        System.out.println("Digite o 2º valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtracao: " + subtrair);
        System.out.println("divisao: " + dividir);
        System.out.println("multiplicacao: " + multiplicar);


    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }



}
