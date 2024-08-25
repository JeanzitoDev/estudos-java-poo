package br.edu.fatecfranca.exercicio1.teste;

import br.edu.fatecfranca.exercicio1.Aluno;

public class TestaAluno {
    public static void main(String[] args) {

       Aluno teste1 = new Aluno(1, "Jean", 22, 10f, 7f);
           Aluno teste2 = new Aluno(2, "Carlos", 22, 5f, 3f);

        System.out.println(teste1.toString());
        System.out.println(teste2.toString());

    }

}
