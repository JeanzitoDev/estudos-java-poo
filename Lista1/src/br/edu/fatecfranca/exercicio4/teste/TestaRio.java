package br.edu.fatecfranca.exercicio4.teste;

import br.edu.fatecfranca.exercicio4.Rio;

public class TestaRio {
    public static void main(String[] args) {
        Rio teste1 = new Rio ("Rio Solimões", 10.5f, true);
        Rio teste2 = new Rio ();

        teste1.chover(3f);
        teste1.ensolarar(5.5f);
        teste1.limpar();
        teste1.mostra();


        teste2.nome = "Rio Negro";
        teste2.nivel = 6.5f;
        teste2.poluido = true;
        System.out.println(teste2);



    }
}
