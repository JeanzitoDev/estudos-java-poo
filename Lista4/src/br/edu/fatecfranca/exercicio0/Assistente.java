package br.edu.fatecfranca.exercicio0;

public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super(); //chama o construtor da superclasse
        this.horaExtra = 0;
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override  //anula o método da classe pai
    public String toString() {
        return super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public float calcularSalario() {
        return this.salario + (horaExtra * 40);
        }
    }
