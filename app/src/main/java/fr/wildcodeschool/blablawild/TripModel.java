package fr.wildcodeschool.blablawild;

import java.util.Date;

public class TripModel {

    private String firstname;
    private String lastname;
    private Date date;
    private int price;

    public TripModel(String firstname, String lastname, Date date, int price) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
