package br.edu.fatecfranca.exercicio2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
        this.saldo = x;
    }

    public void realizarSaque(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
        }
            else System.out.println("Saldo insuficiente.");

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta=" + numeroConta +
                ", numeroAgencia=" + numeroAgencia +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
