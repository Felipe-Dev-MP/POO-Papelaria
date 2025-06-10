package com.mycompany.papelaria;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;
    private int estoque;

    public Produto(String nome, double preco, double desconto, int estoque) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Falha: Nome invalido.");
            return;
        }
        if (preco < 0) {
            System.out.println("Falha: Preço invalido.");
            return;
        }
        if (desconto < 0 || desconto > preco) {
            System.out.println("Falha: Desconto invalido.");
            return;
        }
        if (estoque < 0) {
            System.out.println("Falha: Estoque invalido.");
            return;
        }

        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.estoque = estoque;
    }

    public int acrescentarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Falha: Quantidade invalida.");
            return estoque;
        }
        estoque += quantidade;
        return estoque;
    }

    public int retirarEstoque(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Falha: Estoque insuficiente.");
            return -1;
        }
        estoque -= quantidade;
        return estoque;
    }

    public double getPrecoAVista() {
        return preco - desconto;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
               "\nPreço: R$" + String.format("%.2f", preco) +
               "\nDesconto a vista: R$" + String.format("%.2f", desconto) +
               "\nPreço a vista: R$" + String.format("%.2f", getPrecoAVista()) +
               "\nEstoque: " + estoque;
    }
}

