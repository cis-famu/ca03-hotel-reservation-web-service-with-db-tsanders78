/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.service;

import com.mycompany.projectn2b.model.Address;
import com.mycompany.projectn2b.model.Item;
import com.mycompany.projectn2b.model.PO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 652sa
 */
public class POService {
    
    private ArrayList<PO> list = new ArrayList<>();
    
    public POService(){
        
        Address add1 = new Address("ABC", "Orlando","FL", "33333", null);
        Address add2 = new Address("NBC", "New York","NY", "03231", null);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(3,"H-333","sample"));
        
        list.add(new PO(123, 212, new Date(System.currentTimeMillis()), add1, add1, items));
        list.add(new PO(125, 212, new Date(System.currentTimeMillis()), add1, add1, items));
        list.add(new PO(144, 434, new Date(System.currentTimeMillis()), add2, add2, items));
        
    }
      
    public List<PO> all(){
        return list;
    }

    public ArrayList<PO> getList() {
        return list;
    }

    public void setList(ArrayList<PO> list) {
        this.list = list;
    }
    
    public PO findById(int id){
        
        for(int i =0; i< list.size(); ++i)
        {
            if(list.get(i).getId()==id)
                return list.get(i);
        }
   
        return null;
    }
        
    public ArrayList<PO> getBySubmittedByDate(Date submitted) {
        ArrayList<PO> returnList = new ArrayList<>();
        for(int i =0; i< list.size(); ++i)
        {
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String objDate = formatter.format(list.get(i).getSubmitted());
            
            if(objDate.compareTo(formatter.format(submitted)) == 0)
                returnList.add(list.get(i));
        }
   
        return returnList;
    
    }

    public PO FindDisplayInvocies(int DisplayInvocies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 //To change body of generated methods, choose Tools | Templates.
    
    

