package GestionContact;
import java.util.ArrayList;
import java.util.Collections;

import GestionContact.Scanou;
import GestionContact.Contact;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Create a object
					Contact contact1 = new Contact("Michel","178, boulevard des Herbes", "0609090909",20); 
					Contact contact2 = new Contact("Fifou","45, Chemin des Traces", "0609090909",30);
					Contact contact3 = new Contact("Johanna","32, Rue de la Soif", "0604678994",40);
					
//					ArrayList<Contact> calepin = new ArrayList<Contact>();
//					Collections.addAll(calepin, contact1, contact2, contact3);
//					
//					System.out.println(contact1);
//					System.out.println(contact2);
//					System.out.println(contact3);
					
					System.out.println(calepin);
					Contact contact4 = new Contact(Scanou.scanString("Entrez un nom"), Scanou.scanString("Entrez une adresse"), Scanou.scanString("Entrez une téléphone"), Scanou.Integer.parseInt("Entrez un mail")));
					System.out.println(contact4);
	}

}
