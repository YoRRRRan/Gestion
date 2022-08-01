package GestionContact;

public class Contact {
		
	// Attributes
	
	 	String nom;
	   	String adresse;
	   	String tel;
	   	int age;
	  
	   	// Constructor
	   	
	    public Contact(String nom, String adresse, String tel, int age) {
	        this.nom=nom;
	        this.adresse=adresse;
	        this.tel=tel;
	        this.age=age;
	     }
	    
	 // Return 
	    public String toString() {
	 	   
	 	   return " Nom : "+nom+"\tAdresse : " +adresse+"\tTelephone : " +tel+"\tAge : "+age;
	    }
}
