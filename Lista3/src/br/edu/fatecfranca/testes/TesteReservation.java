package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exercicio3.Flight;
import br.edu.fatecfranca.exercicio3.Passenger;
import br.edu.fatecfranca.exercicio3.Reservation;

import java.util.Date;

public class TesteReservation {
    public static void main(String[] args){
        Passenger teste = new Passenger(001, "Fulano", "123.456.789-11");
        Flight voo1 = new Flight(12345, "Franca", "Dubai");
        Reservation res1 = new Reservation(222, new Date(), teste, voo1);

        System.out.println(res1);
    }
}
