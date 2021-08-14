package entities;

import java.util.Date;

public class Charge {
    private String plate;
    private Date date;
    private Status status;
    private Double price;

    public Charge(String plate, Date date, Status status,Double price) {
        this.plate = plate;
        this.date = date;
        this.status = status;
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}