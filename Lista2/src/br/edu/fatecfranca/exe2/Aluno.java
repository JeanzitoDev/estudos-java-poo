package br.edu.fatecfranca.exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno() {
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if(numeroAluno >= 100000 && numeroAluno <= 999999) {
            this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("Tamanho do número diferente do permitido");
            this.numeroAluno = numeroAluno;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Tamanho do nome excede o permitido!");
            this.nome = "";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }
        else{
            System.out.println("A idade não pode ser negativa!");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        }
        else{
            System.out.println("A nota não pode ser negativa!");
            this.p1= 0f;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        }
        else{
            System.out.println("A nota não pode ser negativa!");
            this.p2 = 0f;
        }
    }

    public void notaFinal() {
       float x = (getP1() + getP2()) / 2;
        System.out.println("Valor da nota final: " + x);
    }

    public void dadosAluno(){
        System.out.println("Número do aluno: " + this.getNumeroAluno() + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\n");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numeroAluno=" + numeroAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}' + "\n";
    }
}
