/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.model;

import java.util.Date;
import java.util.ArrayList;
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
public class PO {
    private @XmlAttribute int id;
    private @XmlAttribute int customerId;
    private @XmlAttribute Date submitted;
    private Address billTo, shipTo;
    private ArrayList<Item> order;

    public PO(int id, int customerId, Date submitted, Address billTo, Address shipTo, ArrayList<Item> order) {
        this.id = id;
        this.customerId = customerId;
        this.submitted = submitted;
        this.billTo = billTo;
        this.shipTo = shipTo;
        this.order = order;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getsubmiteddate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getSubmitted() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
    
}

