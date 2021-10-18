/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.model;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author 652sa
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

public class Invoice {
    
   private int id;
   private @XmlAttribute  Date submitted;
   private @XmlAttribute int customerId;
   private @XmlAttribute Address billTo;
   private Address shipTo;
   private ArrayList<InvoiceItem> order;
   private double tax;
   private double shippingAndHandling;
   private double totalCost;
   
   public Invoice(){
        
    }

    public Invoice(int id, Date submitted, int customerId, Address billTo, Address shipTo, ArrayList<InvoiceItem> order, double tax, double shippingAndHandling, double totalCost) {
        this.id = id;
        this.submitted = submitted;
        this.customerId = customerId;
        this.billTo = billTo;
        this.shipTo = shipTo;
        this.order = order;
        this.tax = tax;
        this.shippingAndHandling = shippingAndHandling;
        this.totalCost = totalCost;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Address getBillTo() {
        return billTo;
    }

    public void setBillTo(Address billTo) {
        this.billTo = billTo;
    }

    public Address getShipTo() {
        return shipTo;
    }

    public void setShipTo(Address shipTo) {
        this.shipTo = shipTo;
    }

    public ArrayList<InvoiceItem> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<InvoiceItem> order) {
        this.order = order;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShippingAndHandling() {
        return shippingAndHandling;
    }

    public void setShippingAndHandling(double shippingAndHandling) {
        this.shippingAndHandling = shippingAndHandling;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

   
   public int getId(){
       
       return id;
       
   }
}
