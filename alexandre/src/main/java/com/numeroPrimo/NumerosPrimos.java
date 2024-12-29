package com.numeroPrimo;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    //metodo recursivo para imprimir numeros primos
    public void primoRecursivo(int numero){
        //verifica o número
        if(numero <= 1){
            throw new RuntimeException("O número deve ser maior que 1");
        }
      
        List<Integer> primos = encontrarPrimosRecursivo(numero, 2, new ArrayList<>());
        System.out.println("Números primos até "+numero+": "+primos);
    }

    private List<Integer> encontrarPrimosRecursivo(int limite, int atual, List<Integer> primos){
        if(atual > limite){
            return primos;
        }

        if(ehPrimo(atual)){
            primos.add(atual);
        }

        return encontrarPrimosRecursivo(limite, atual + 1, primos);
    }

    //metodo linear para imprimir numeros primos
    public void primoLinear(int numero){
        //verifica se o número é de dois para cima
        if(numero <= 1){
            throw new RuntimeException("O número deve ser maior que 1");
        }
        //Lista para contar os divisores por numero
        List<Integer> primos = new ArrayList<>();

        //se o numero for primo adiciona mais um na lista
        for(int i = 2; i <= numero; i++){
            if(ehPrimo(i)){
                primos.add(i);
            }
        }

        System.out.println("Números primos até "+numero+": "+primos);
    }

    private boolean ehPrimo(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
