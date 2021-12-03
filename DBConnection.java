/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.b2bwebservices.model.service;

/**
 *
 * @author colli
 */

    public class DBConnection {

	//Database connection variable. It is shared with any class that inherits from this class
    protected static Firestore db;
    
	//constructor
	//throws file and IO exceptions from attempting to open the credential file
    public DBConnection() {
        
		
		//Your project id
        String projectId = "YOUR_PROJECT_ID";
		
		//Open the credential json file 
        FileInputStream serviceAccount;
       try{ 
serviceAccount  = new FileInputStream("FULL_PATH_TO_CREDENTIAL_FILE");
        
		//set up database connection
        FirestoreOptions firestoreOptions =
        FirestoreOptions.getDefaultInstance().toBuilder()
            .setProjectId(projectId)
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();
			
		//connect to database
        db = firestoreOptions.getService();
    }catch (IOException ex) {
        Logger.getLogger(DBConnection.class.getName()).llog(Level.SEVERE, null, ex);
}


}

