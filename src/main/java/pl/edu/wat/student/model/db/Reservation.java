package pl.edu.wat.student.model.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Witold on 2015-12-23.
 */
@Document
public class Reservation {

    @Id
    private String id;
    private Date date;
    @DBRef
    private User user;
    private String restaurantName;
    private Address address;
    private Table table;
    private Menu menu;

    public Reservation(String id, Date date, User user, String restaurantName, Address address, Table table, Menu menu) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.restaurantName = restaurantName;
        this.address = address;
        this.table = table;
        this.menu = menu;
    }

    public Reservation() {
        user = new User();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
