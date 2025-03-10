package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exercicio0.Assistente;
import br.edu.fatecfranca.exercicio0.Diretor;
import br.edu.fatecfranca.exercicio0.Funcionario;
import br.edu.fatecfranca.exercicio0.Gerente;

import java.util.ArrayList;


public class TesteFuncionario {
    public static void mostra(Funcionario func){
        System.out.println(func.toString());
    }
    public static void calculaFolhaSalarial (ArrayList<Funcionario> funcionarios){
        float soma = 0;
        for (Funcionario func : funcionarios) {
            soma += func.getSalario();
        }
    }

    public static void main(String[] args) {
        Assistente ass1 = new Assistente("Jean", "Rua do cu de judas", "123.456.789-11", 3000, 4);
        mostra(ass1);

        Gerente gerente1 = new Gerente("Pedro", "Ribeirão", "814.318.965-12", 5000, 2000);
        mostra(gerente1);

        Diretor diretor1 = new Diretor("Paulo", "São Paulo", "456.654.453-45", 8000, 1000);
        mostra(diretor1);



        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(ass1);
        lista.add(gerente1);
        lista.add(diretor1);

    }
}