package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exercicio2.Forum;
import br.edu.fatecfranca.exercicio2.Message;
import br.edu.fatecfranca.exercicio2.Person;

public class TesteForum {
    public static void main(String[] args){
        Forum teste1 = new Forum(001, "Kiloukura", "www.kiloukura.com.br");
        Person pessoa = new Person(001, "Jean", "Jean013");
        Message msg1 = new Message(123, "Vou pra praia", pessoa);
        Message msg2 = new Message(345, "Te amo safada", pessoa);

        teste1.addMessage(msg1);
        teste1.addMessage(msg2);
        System.out.println(teste1);

    }
}
