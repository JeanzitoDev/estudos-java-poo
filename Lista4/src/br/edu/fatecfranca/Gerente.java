package br.edu.fatecfranca;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super();
        this.bonus = 0.0f;
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "bonus=" + bonus;
    }

    @Override
    public float calcularSalario(){
        return this.salario + this.bonus;
    }
}
