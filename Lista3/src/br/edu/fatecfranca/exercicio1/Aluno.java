package br.edu.fatecfranca.exercicio1;

public class Aluno {

    private int id;
    private String name;

    public Aluno() {
    }

    public Aluno(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

