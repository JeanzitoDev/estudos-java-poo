package br.edu.fatecfranca.exercicio3.teste;

import br.edu.fatecfranca.exercicio3.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(345, "Mamão", 2, 3.75f);

        produto.comprar(2);
        produto.vender(1);
        produto.subir(1.00f);
        produto.descer(2.00f);
        produto.mostrar();

        Produto teste2 = new Produto();

        teste2.id = 567;
        teste2.descricao = "Melancia";
        teste2.quantidade = 4;
        teste2.preco = 9.45f;
        teste2.vender(5);
        System.out.println(teste2);

    }
}
