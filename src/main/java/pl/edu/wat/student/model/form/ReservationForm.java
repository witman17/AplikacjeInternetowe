package pl.edu.wat.student.model.form;

import pl.edu.wat.student.model.db.Restaurant;

/**
 * Created by Witold on 2016-01-07.
 */
public class ReservationForm {
    private Restaurant restaurant;
    private String date;

    public ReservationForm(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ReservationForm() {
    }

    public ReservationForm(Restaurant restaurant, String date) {
        this.restaurant = restaurant;
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
