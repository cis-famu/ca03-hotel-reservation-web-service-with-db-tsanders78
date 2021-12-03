/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colli
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class hotelInformation {
            private ArrayList<rooms> rooms;
            public String name;
            public String address;
            public String phone;

//rooms get and set
public ArrayList<rooms> getRoom(){
    return rooms;
}

public void setRoom(ArrayList<rooms> rooms){
    this.rooms = rooms;
}



//name of the hotel
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//address
public String getAddress() {
        return address;
    }

    public void setName(String address) {
        this.address = address;
    }



//Phone number 
public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }


}
