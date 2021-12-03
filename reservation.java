/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bwebservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author colli
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class reservation extends DBConnection {

private int @xmlAttribute customerId,
private int @xmlAttribute confirmationNumber,
private @xmlAttribute String completed,
private @xmlAttribute String paymentStatus,
private @xmlAttribute String platform;


public hotelInformation information;
public Date checkOut,
public Date checkIn;
public String reservationName;
public int adultGuests;
public int minorGuests;
public String cancellationPolicy;



//get and set for customerId
public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
//get and set for confirmationNumber
public int getCustomerId() {
        return customerId;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
//get and set for completed
public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
//get and set for paymentStatus
public int getCustomerId() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
//get and set for platform
public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }






//hotel reservation get and set
public hotelInformation getInformation() {
        return information;
    }

    public void setInformation(hotelInformation information) {
        this.information = information;
    }






//Date submitted
public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

//reservation name
public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }


//number of adult guests
public int getAdultGuests() {
        return adultGuests;
    }

    public void setAdultGuests(int adultGuests) {
        this.adultGuests = adultGuests;
    }

//number of kid guests
public int getMinorGuests() {
        return minorGuests;
    }

    public void setMinorGuests(int minorGuests) {
        this.minorGuests = minorGuests;
    }

//Hotel information by reference and Rooms - must be called
//name, address, phone, room = floor, number, bed type



//CancellationPolicy

public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }


}
