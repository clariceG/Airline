package com.apps.airline.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PASSENGER")
public class Passenger {
    @Id
    @Column(name = "PASSENGER_ID")
    private Long passengerId;
    @Column(name = "PASSENGER_NAME")
    private String passengerName;
    @Column(name = "PHONE_NUMBER")
    private int phoneNumber;
    @Column(name = "GENDER")
    private String gender;

    public Passenger(Long passengerId, String passengerName, int phoneNumber, String gender) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Passenger() {

    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}
