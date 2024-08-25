package br.edu.fatecfranca.exercicio2.teste;

import br.edu.fatecfranca.exercicio2.Cliente;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(10303, 456, "Jean", 0);

        cliente.realizarDeposito(800);
        cliente.realizarSaque(350);
        cliente.realizarSaque(400);
        cliente.realizarSaque(300);
        System.out.println(cliente);

    }
}
