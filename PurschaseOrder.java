/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectn2b.endpoint;

import com.mycompany.projectn2b.model.PO;
import com.mycompany.projectn2b.service.POService;
import java.util.Date;
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
public class PurchaseOrder {
    
    private final POService service = new POService();
    
    @WebMethod(operationName="allPOs")
    @WebResult (name="PurchaseOrder")
    public List<PO> getAllPurchaseOrders(){
        return service.all();
    }
    @WebResult(name="PurchaseOrder")
    public PO getPurschaseOrderById(@WebParam(name ="purchaseorderId") int id){
        return service.findById(id);
    }
    
    @WebResult(name="PurchaseOrder")
    public List<PO> getBySubmittedDate(@WebParam(name="submitteDate") Date submitted){
        return service.getBySubmittedByDate(submitted);
    }
    
    @WebResult(name="DisplayInvocies")
    public PO getDisplayInvocies(@WebParam(name="getDisplayInvocies") int DisplayInvocies){
        return service.FindDisplayInvocies(DisplayInvocies);
    }
}
