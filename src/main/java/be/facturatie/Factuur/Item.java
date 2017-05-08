/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facturatie.Factuur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Brech
 */
@Entity
public class Item {
    @Id
    @Column(nullable=false)
    private int id;
    
    @Column(nullable=false)
    private String description;
    
    @Column(nullable=false)
    private int amount;
    
    @Column(nullable=false)
    private double cost;

    public Item(String description, int amount, double cost, int btwProcent) {
        this.description = description;
        this.amount = amount;
        this.cost = cost;
    }
    
    
    public double getTotalAmountCost(){
        return amount * cost;
    }


    // <editor-fold defaultstate="collapsed" desc="getters/setters">                          
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    //</editor-fold>

}
