package br.edu.fatecfranca.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> Mensagens = new ArrayList<Message>();

    public Forum() {
    }

    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMensagens() {
        return Mensagens;
    }

    public void setMensagens(List<Message> mensagens) {
        Mensagens = mensagens;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id: " + id +
                "name: '" + name + '\'' +
                "url: '" + url + '\'' +
                "Mensagens: " + Mensagens +
                '}';
    }

    public void addMessage(Message message){
        this.Mensagens.add(message);
    }
}
