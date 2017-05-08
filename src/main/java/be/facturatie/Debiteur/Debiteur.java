/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facturatie.Debiteur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 *
 * @author Brech
 */
@Component
@Entity
public class Debiteur {
    @Id
    @Column(nullable=false)
    private int id;
    @Column(nullable=false)
    private String company;
    @Column(nullable=true)
    private String owner;
    @Column(nullable=false)
    private String btwnr;
    @Column(nullable=false)
    private String street;
    @Column(nullable=false)
    private int number;
    @Column(nullable=false)
    private int zipcode;
    @Column(nullable=false)
    private String city;
    @Column(nullable=true)
    private String email;
    @Column(nullable=true)
    private String phone;

    public Debiteur() { }
    
    //<editor-fold desc="get/set">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.company = bedrijfsnaam;
    }

    public String getOwner() {
        return owner;
    }

    public void setEigenaar(String eigenaar) {
        this.owner = eigenaar;
    }

    public String getBtwnr() {
        return btwnr;
    }

    public void setBtwnr(String btwnr) {
        this.btwnr = btwnr;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setTelefoon(String telefoon) {
        this.phone = telefoon;
    }
    //</editor-fold>

    
    
    
}
