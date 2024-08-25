package br.edu.fatecfranca.exercicio3;

public class Produto {
    public int id;
    public String descricao;
    public int quantidade;
    public float preco;

    public Produto() {

    }

    public Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void comprar(int x){
        this.quantidade += x;

    }
    public void vender(int x){
        if (this.quantidade - x >=0){
            this.quantidade -= x;
        }
        else{
            System.out.println("Produto sem estoque!");
        }
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        this.preco -= x;
    }

    public void mostrar(){
        System.out.println(
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}

