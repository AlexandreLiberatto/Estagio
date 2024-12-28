package com.fibonacci;

public class Fibonacci {

    private int numero;

    //Construtor
    public Fibonacci(int numero){
        this.numero = numero;
    }

    //Metodo recursivo
    public int fibonacciRecursivo(int numero){
        if(numero < 0){
            throw new RuntimeException("O número precisa ser maior oum igual à zero!");
        } 

        if(numero == 0){
            return 0;
        } else if(numero == 1){
            return 1;
        }

        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
    }

    //Metodo linear
    public int fibonacciLinear(int numero){
        if(numero < 0){
            throw new RuntimeException("O número precisa ser maior ou igual à zero!");
        } 

        if(numero == 0){
            return 0;
        } else if(numero == 1){
            return 1;
        }

        int numeroAnterior = 1;
        int numeroAnteAnterior = 0;

        for(int i = 2; i <= numero; i++){
            int totalDoisNumAnterior = numeroAnteAnterior + numeroAnterior;

            numeroAnteAnterior = numeroAnterior;
            numeroAnterior = totalDoisNumAnterior;
        }
        return numeroAnterior;
    }

    //Método para imprimir o resultado no console
    public void imprimirRecursivo(int numero){
        System.out.println("O Fibonacci de "+ numero +" é: "+ fibonacciRecursivo(numero));
    }

    //Método para imprimir o resultado no console
    public void imprimirLinear(int numero){
        System.out.println("O Fibonacci de "+ numero +" é: "+ fibonacciLinear(numero));
    }

    //Getters e Setters
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    

}
