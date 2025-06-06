package org.example;


public class Main {


    public static void main(String[] args) {
        // Conversão implícita (sem perda)
        int idade = 30;
        double idadeDouble = idade;

        // Conversão explícita (com perda)
        double preco = 19.99;
        int precoInteiro = (int) preco;

        // Conversão entre tipos incompatíveis exige métodos específicos
        String numeroTexto = "123";
        int numero = Integer.parseInt(numeroTexto);

        System.out.println("Idade (double): " + idadeDouble);
        System.out.println("Preço (int): " + precoInteiro);
        System.out.println("Número convertido de String: " + numero);
    }

    }
