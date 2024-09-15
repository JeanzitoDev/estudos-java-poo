package br.edu.fatecfranca.exercicio3;

import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    private Passenger passenger;
    private Flight flight;

    public Reservation() {
    }

    public Reservation(int id, Date date, Passenger passenger, Flight flight) {
        this.id = id;
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", \n" + passenger +
                ", \n" + flight +
                '}';
    }
}
