package com.apps.airline.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TICKET")
public class Ticket {
    @Id
    @Column(name = "TICKET_ID")
    private Long ticketId;
    @Column(name = "PURCHASE_DATE")
    private Date purchaseDate;
    @Column(name = "SEAT_NUMBER")
    private int seatNumber;
    @Column(name = "TICKET_CLASS")
    private String ticketClass;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "DESTINATION")
    private String destination;

    public Ticket(Long ticketId, Date purchaseDate, int seatNumber, String ticketClass, String source, String destination) {
        this.ticketId = ticketId;
        this.purchaseDate = purchaseDate;
        this.seatNumber = seatNumber;
        this.ticketClass = ticketClass;
        this.source = source;
        this.destination = destination;
    }

    public Ticket() {

    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", purchaseDate=" + purchaseDate +
                ", seatNumber=" + seatNumber +
                ", ticketClass='" + ticketClass + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
