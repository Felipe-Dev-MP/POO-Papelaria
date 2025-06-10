package com.mycompany.papelaria;

public class Papelaria {

    public static void main(String[] args) {
        Produto caneta = new Produto("Bloco de Notas", 5.00, 1.00, 100);
        System.out.println(caneta);

        System.out.println("\nAcrescentando 50 ao estoque:");
        caneta.acrescentarEstoque(50);
        System.out.println(caneta);

        System.out.println("\nRetirando 100 do estoque:");
        int resultado = caneta.retirarEstoque(100);
        System.out.println("Resultado da retirada: " + resultado);

        System.out.println("\nRetirando 80 do estoque:");
        resultado = caneta.retirarEstoque(80);
        System.out.println("Resultado da retirada: " + resultado);

        System.out.println("\nEstoque final:");
        System.out.println(caneta);
    }
}
