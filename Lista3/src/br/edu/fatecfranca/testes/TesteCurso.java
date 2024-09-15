package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exercicio1.Aluno;
import br.edu.fatecfranca.exercicio1.Curso;
import br.edu.fatecfranca.exercicio1.Professor;

public class TesteCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Paulo");
        Aluno aluno2 = new Aluno(2, "Pedro");
        Aluno aluno3 = new Aluno(3, "Maria");
        Professor prof1 = new Professor(10, "Carlão", "Carlão123");

        Curso curso1 = new Curso(100, "ADS", "Exatas");
        curso1.addDisciplina(1000, "Eng Software", "ES03", prof1);

        curso1.addAlunoDisciplina(1000, aluno1);
        curso1.addAlunoDisciplina(1000, aluno2);
        curso1.addAlunoDisciplina(1000, aluno3);

        System.out.println(curso1);
    }
}
