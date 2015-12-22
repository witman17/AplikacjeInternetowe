package pl.edu.wat.student.model;

import java.util.ArrayList;

/**
 * Created by Witold on 2015-12-24.
 */
public class Menu {

    private String name;
    private ArrayList<MenuElement> elements;

    public Menu(String name, ArrayList<MenuElement> elements) {
        this.name = name;
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<MenuElement> elements) {
        this.elements = elements;
    }
}
