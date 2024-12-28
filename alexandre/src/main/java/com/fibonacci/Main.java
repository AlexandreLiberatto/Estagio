package com.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Entrada pelo console
        Scanner sc = new Scanner(System.in);

        //Instanciando objeto
        Fibonacci fibonacci = new Fibonacci(0);

        try {

        System.out.println("Digite um número para ver seu Fibonacci usando método recursivo: ");
        int entrada1 = sc.nextInt();
        fibonacci.setNumero(entrada1);
        int numero = fibonacci.getNumero();

        //Imprimindo Fibonacci usando método recursivo
        fibonacci.fibonacciRecursivo(numero);

        System.out.println("Digite um número para ver seu Fibonacci usando método recursivo: ");
        int entrada2 = sc.nextInt();
        fibonacci.setNumero(entrada2);
        numero = fibonacci.getNumero();

        //Imprimindo Fibonacci usando método linear
        fibonacci.imprimirLinear(numero);
            
        } catch (Exception e) {
            System.out.println("Ops! Aconteceu o seguinte erro: "+ e.getMessage());
        } finally {
            sc.close();
        }

        
    }
    
}
