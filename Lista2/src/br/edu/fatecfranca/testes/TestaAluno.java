package br.edu.fatecfranca.testes;


import br.edu.fatecfranca.exe2.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno teste1 = new Aluno(123456, "Jean", 22, 6, 8);

        teste1.notaFinal();
        teste1.dadosAluno();
        System.out.println(teste1);

        Aluno teste2 = new Aluno();

        teste2.setNumeroAluno(1234);
        teste2.setNome("Jean Carlos Malaquias Gonalves Da Silva");
        teste2.setIdade(-98);
        teste2.setP1(-9);
        teste2.setP2(3);

        teste2.notaFinal();
        teste2.dadosAluno();
        System.out.println(teste2);

    }
}
