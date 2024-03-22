/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hct.ae.activity07_ex2_factory;

/**
 *
 */
import java.util.ArrayList;

public abstract class Invitation {

    private String datetime;
    private ArrayList<Item> meals;

    public void setDate(String datetime) {
        this.datetime = datetime;
    }

    public String getDate() {
        return this.datetime;
    }

    public void addItem(Item i) {
        meals.add(i);
    }

    public Item getItem(int k) {
        return meals.get(k);
    }

    public int count() {
        return meals.size();
    }

    public Invitation(int size) {
        meals = new ArrayList<Item>(size);
    }

    public abstract void createInvitation(String d);

}
