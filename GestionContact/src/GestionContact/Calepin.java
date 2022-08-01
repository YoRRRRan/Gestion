package GestionContact;
import java.util.ArrayList;

public class Calepin {
	ArrayList<Contact>List1;
	String List2;
	
	public Calepin(String calepin)	{
		this.List2=calepin;
		List1 = new ArrayList<Contact>();
	}
	
	public String toString()	{
		String chaine =List2 + "\n";
		for(Contact ListA : List1)	{
		 chaine = ListA + "\n";
		}
		return chaine;
	}
}
