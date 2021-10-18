/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author 652sa
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)


public class Address {
    private String company, city, state, postalCode;
    private ArrayList<String> street;

    public Address(String company, String city, String state, String postalCode, ArrayList<String> street) {
        this.company = company;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.street = street;
    }
    
    public Address() {
       
   }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<String> getStreet() {
        return street;
    }

    public void setStreet(ArrayList<String> street) {
        this.street = street;
    }
    
   

        

}
    
   
