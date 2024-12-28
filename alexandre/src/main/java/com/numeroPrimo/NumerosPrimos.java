package com.numeroPrimo;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    private int numero;

    //Construtor
    public NumerosPrimos(int numero){
        this.numero = numero;
    }

    //metodo recursivo para imprimir numeros primos
    public int primoRecursivo(int numero){
        //verifica se o número é de dois para cima
        if(numero <= 1){
            throw new RuntimeException("O número deve ser maior que 1");
        }
        //Lista para contar os divisores por numero
        List<Integer> contaPrimos = new ArrayList<>();

        //se o numero for primo adiciona mais um na lista
        for(int i = 2; i <= numero; i++){
            if(i % numero == 0){
                contaPrimos.add(1);
            }
        }

        //se o numero for primo, imprime todos os primos até o número digitado
        if(contaPrimos.size() == 1){
            System.out.println("O número é primo!");
            for(int i = 1; i <= numero; i++){
                if(i % numero == 0){
                    System.out.println("Número primo: "+ i);
                }
            }
        } else {
            System.out.println("O número "+ numero +" não é primo!");
        }
        return primoRecursivo(numero);
    }

    //metodo linear para imprimir numeros primos
    public void primoLinear(int numero){
        //verifica se o número é de dois para cima
        if(numero <= 1){
            throw new RuntimeException("O número deve ser maior que 1");
        }
        //Lista para contar os divisores por numero
        List<Integer> contaPrimos = new ArrayList<>();

        //se o numero for primo adiciona mais um na lista
        for(int i = 2; i <= numero; i++){
            if(i % numero == 0){
                contaPrimos.add(1);
            }
        }

        //se o numero for primo, imprime todos os primos até o número digitado
        if(contaPrimos.size() == 1){
            System.out.println("O número é primo!");
            for(int i = 1; i <= numero; i++){
                if(i % numero == 0){
                    System.out.println("Número primo: "+ i);
                }
            }
        } else {
            System.out.println("O número "+ numero +" não é primo!");
        }
    }

    //getter e setter
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    
}
