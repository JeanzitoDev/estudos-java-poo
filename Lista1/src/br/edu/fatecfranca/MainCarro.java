
package br.edu.fatecfranca;

import javax.swing.*;

public class MainCarro {
    public static void main(String[] args) {
        //instanciando os objetos da classe Carro

        Carro obj1 = new Carro("Toyota ", "Corolla ", "Cinza ", 2018 , 0);

        Carro obj2 = new Carro("Chevrolet ", "Onix ", "Preto ", 2013 , 0);

        //JOptionPane.showInputDialog é um método da biblioteca JOptionPane do
        // Java para criar inputs para o usuário inserir outros valores

        String x = JOptionPane.showInputDialog("Acelerar de quanto?");


        obj1.acelerar(Float.parseFloat(x));
        obj1.frear(50);
        JOptionPane.showMessageDialog(null,obj1.toString());

        String y = JOptionPane.showInputDialog("Acelerar de quanto?");

        obj2.acelerar(Float.parseFloat((y)));
        obj2.frear(60);
        JOptionPane.showMessageDialog(null,obj2.toString());

        // JOptionPane.showMessageDialog é um método da biblioteca JOptionPane do
        // Java para criar outputs para os usuários
    }
}