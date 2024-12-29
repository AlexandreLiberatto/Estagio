package com.numeroPrimo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        NumerosPrimos primos = new NumerosPrimos();

        try {

        System.out.println("Digite um número para verificar se ele é primo: ");
        int entrada = sc.nextInt();

        //Chamando método recursivo
        primos.primoRecursivo(entrada);

        //Chamando métodom linear
        primos.primoLinear(entrada);
            
        } catch (Exception e) {
            System.out.println("Ops! Erro: "+ e.getMessage());
        } finally {
            sc.close();
        }

        
    }
    
}
