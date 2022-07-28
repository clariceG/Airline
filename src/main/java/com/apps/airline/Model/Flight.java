package com.apps.airline.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Timer;

@Entity
@Table
public class Flight {
    @Id
    @Column(name = "FLIGHT_ID")
    private Long flightId;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "BOARDING_GATE")
    private String boardingGate;
    @Column(name = "CAPACITY")
    private int capacity;
    @Column(name = "PLANE_MODEL")
    private String planeModel;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private Staff staff;
    @ManyToOne
    @JoinColumn(name = "passenger_passenger_id")
    private Passenger passenger;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight(Staff staff) {
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Flight(Long flightId, Date date, String boardingGate, int capacity, String planeModel) {
        this.flightId = flightId;
        this.date = date;
        this.boardingGate = boardingGate;
        this.capacity = capacity;
        this.planeModel = planeModel;
    }

    public Flight() {

    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    @Override
    public String  toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", date=" + date +
                ", boardingGate='" + boardingGate + '\'' +
                ", capacity=" + capacity +
                ", planeModel='" + planeModel + '\'' +
                ", staff=" + staff +
                ", passenger=" + passenger +
                '}';
    }
}
