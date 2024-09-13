package br.edu.fatecfranca;

import br.edu.fatecfranca.Funcionario;
import br.edu.fatecfranca.Assistente;
import br.edu.fatecfranca.Gerente;
import br.edu.fatecfranca.Diretor;



public class Main {
    public static void mostra(Funcionario func){
        System.out.println(func.toString());
    }

    public static void main(String[] args) {
        Assistente ass1 = new Assistente("Jean", "Rua do cu de judas", "123.456.789-11", 3000, 4);
        mostra(ass1);

        Gerente gerente1 = new Gerente("Pedro", "Ribeirão", "814.318.965-12", 5000, 2000);
        mostra(gerente1);

        Diretor diretor1 = new Diretor("Paulo", "São Paulo", "456.654.453-45", 8000, 1000);
        mostra(diretor1);

    }
}