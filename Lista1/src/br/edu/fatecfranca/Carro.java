package br.edu.fatecfranca;

import org.w3c.dom.ls.LSOutput;

public class Carro {
    //declaração de variáveis

    public String marca, modelo, cor;

    public int ano;

    public float velAtual;

    // método construtor
    // os parâmetros representam os valores do usuário que serão atribuídos ao objeto


   public Carro() {
       this.marca = "";
       this.modelo = "";
   }

   public Carro(String marca, String modelo, String cor, int ano, float velAtual) {
       //this represnta o objeto (obj1, obj2) que chama o método

       this.marca = marca;
       this.modelo = modelo;
       this.cor = cor;
       this.ano = ano;
       this.velAtual = velAtual;

   }

   public void acelerar(float x){
       this.velAtual += x;
   }

   public void frear(float x){
       if (this.velAtual -x >= 0){
           this.velAtual -= x;
       }
        else{
           System.out.println("Velocidade não pode ser negativa!");
       }
   }

   //converte o obj para uma string

    public String toString() {
        return "Marca: " + this.modelo + "modelo: " + this.modelo +
                this.cor + "ano: " + this.ano + " vel: " + this.velAtual;
    }
}
