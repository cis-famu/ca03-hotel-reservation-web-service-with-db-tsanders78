/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.endpoint;

import com.mycompany.projectn2b.service.InvoiceService;
import com.mycompany.projectn2b.model.Invoice;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
        

/**
 *
 * @author 652sa
 
*/

@WebService
public class INV {
    private final InvoiceService service = new InvoiceService();
    
    @WebMethod   
    @WebResult(name="Invoice")
    public Invoice getByID(@WebParam(name="id") int id) {
    return service.findById(id);
    }


    @WebResult(name="Invoice")
    public List<Invoice> getByCustomer(@WebParam(name="customerId") int id) {
    return service.findByCustomerId(id);
    }


}
