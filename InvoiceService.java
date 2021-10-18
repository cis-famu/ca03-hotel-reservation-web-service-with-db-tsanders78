/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.service;

import com.mycompany.projectn2b.model.Invoice;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 652sa
 */
public class InvoiceService {
    private final ArrayList<Invoice> list = new ArrayList<>();
    
    

public Invoice findById(int id)
{
 
 for(Invoice inv: list){
    if(inv.getId() == id)
    return inv;
}
 return null;
}


public ArrayList<Invoice> findAll(){
      return list;
}

    public List<Invoice> findByCustomerId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
