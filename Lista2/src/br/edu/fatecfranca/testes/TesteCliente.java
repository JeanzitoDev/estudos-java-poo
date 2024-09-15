package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exe1.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
            Cliente teste1 = new Cliente(1000f, "Fulano", "1234-6", "123459-8");

            teste1.depositar(500f);
            teste1.sacar(1000f);
            System.out.println(teste1);

            Cliente teste2 = new Cliente();

            teste2.setNome("Cliente");
            teste2.setNumeroConta("2345-99");
            teste2.setNumeroAgencia("123-9");
            teste2.setSaldo(500f);

            teste2.depositar(100f);
            teste2.sacar(750f);
            System.out.println(teste2);

        }
    }