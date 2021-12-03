/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colli
 */
public class REService {


/*
Find a reservation by confirmationNo
*/
public reservation findByConfirmationNo(int confirmationNumber) throws InterruptedException, ExecutionException {
    
	//refernce to the collection(table)
	CollectionReference  reservation = db.collection("reservation");
	//query where clause
	Query query = reservation.whereEqualTo("confirmationNumber", confirmationNumber);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(reservation.class);

  
  return null;
}
/*
Find all reservation by customerNo
*/

public List<rooms> all() throws InterruptedException, ExecutionException {
	List<rooms> results = new ArrayList<>();
  
	// asynchronously retrieve all users
	ApiFuture<QuerySnapshot> query = db.collection("reservation").get();
	
	//query where clause
	Query query = reservation.whereEqualTo("customerId", customerId);

	// query.get() blocks (stops other processes from excuting) on response 
	// call to firebase
	QuerySnapshot querySnapshot = query.get();
	
	//getting the result set 
	List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();

        //loop over result set and add them to list
	for(QueryDocumentSnapshot document : documents){
		results.add(document.toObject(reservation.class));
	}
	
	return results;
}



/*
Find a reservation within a data range
*/
public reservation findBySubmittedDate(Date checkIn, Date checkOut){
ArrayList<reservation> returnList = new ArrayList();
    for(int x = 0; x < list.size(); ++x)
{
 
//Retreives only the Date part and ignores the time
   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
String objDate = formatter.format(list.get(x).getCheckIn());

    if(objDate.compareTo(formatter.format(checkIn)) = 0)
        returnList.add(list.get(i));

 return returnList;
}
//refernce to the collection(table)
	CollectionReference  reservation = db.collection("reservation");
	//query where clause
   Query checkInQuery = checkIn.whereGreaterThanOrEqualTo("checkIn", checkIn).whereLessThanOrEqualTo("checkIn", checkOut);
	
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(PO.class);

return null;


}







/*
Get all reservations after a checkin date
*/

public reservation findBySubmittedDate(Date checkIn, Date checkOut){
ArrayList<reservation> returnList = new ArrayList();
    for(int x = 0; x < list.size(); ++x)
{
 
//Retreives only the Date part and ignores the time
   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
String objDate = formatter.format(list.get(x).getCheckIn());

    if(objDate.compareTo(formatter.format(checkIn)) = 0)
        returnList.add(list.get(i));

 return returnList;
}
//refernce to the collection(table)
	CollectionReference  reservation = db.collection("reservation");
	//query where clause
	Query validQuery = checkIn.whereGreaterThanOrEqualTo("checkIn", checkIn).whereGreaterThan("checkIn", checkOut); 
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(reservation.class);

return null;


}






public PO findById(int id) throws InterruptedException, ExecutionException {
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("PurchaseOrder");
	//query where clause
	Query query = po.whereEqualTo("customerNo", id);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(PO.class);

  
  return null;
}

/*
Get all reservations by payment status
*/
public reservation findByPaymentStatus(String paymentStatus) throws InterruptedException, ExecutionException {
    
	//refernce to the collection(table)
	CollectionReference  reservation = db.collection("reservation");
	//query where clause

	Query query = reservation.whereEqualTo("paymentStatus", paymentStatus);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(reservation.class);

  
  return null;
}

/*
Get all reservations by platform

*/
public PO findByPlatform(String platform) throws InterruptedException, ExecutionException {
    
	//refernce to the collection(table)
	CollectionReference  reservation = db.collection("reservation");
	//query where clause
	Query query = reservation.whereEqualTo("platform", platform);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(reservation.class);

  
  return null;
}


//Create a new reservation (new)


public String createReservation(int customerId, int confirmationNumber, String completed, String confirmationNumber, String paymentStatus, String platform, hotelInformation Information, ArrayList<rooms> rooms, String cancellationPolicy){

            simpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd |00:00:00");
String now = formatter.format(new Date(System.currentTimeMillis()));

Date submitted = formatter.parse(now);

Random rand = new Random();
int id = rand.nextInt(10000);

reservation createReservation = new createReservation(customerId, confirmationNumber, completed, confirmationNumber, paymentStatus, platform, information, ArrayList<rooms> rooms, cancellationPolicy);

ApiFuture<DocumentReference> future = db.collection("reservation").add(newReservation);

DocumentReference doc = future.get();


return doc.getId;
}




}
