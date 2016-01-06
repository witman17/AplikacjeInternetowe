package pl.edu.wat.student.model.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

/**
 * Created by Witold on 2015-12-23.
 */
@Document
public class Restaurant {

    private
    @Id
    String id;
    private String name;
    private Address address;
    private ArrayList<Table> tables;

    public Restaurant(String name, Address address, ArrayList<Table> tables) {
        this.name = name;
        this.address = address;
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public ArrayList<Table> getFreeTables() {
        ArrayList<Table> freeTables = new ArrayList<Table>(tables.size() / 2);
        for (Table table : tables) {
            if (table.isFree())
                freeTables.add(table);
        }
        return freeTables;
    }

}
