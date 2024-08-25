package br.edu.fatecfranca.exercicio1;

public class Aluno {
    public int numeroAluno;
    public String aluno;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(){

    }

    public Aluno(int numeroAluno, String aluno, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.aluno = aluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String passou(){
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numeroAluno=" + numeroAluno +
                ", aluno='" + aluno + '\'' +
                ", idade=" + idade +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", média=" + notaFinal() +
                ", situação=" + passou() +
                '}';
    }
}


