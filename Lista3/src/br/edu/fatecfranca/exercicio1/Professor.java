package br.edu.fatecfranca.exercicio1;

public class Professor {

    private int id;
    private String name;
    private String userName;

    public Professor() {
    }

    public Professor(int id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "\nProfessor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
