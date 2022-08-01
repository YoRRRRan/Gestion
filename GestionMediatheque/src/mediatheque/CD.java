package mediatheque;



public class CD extends Multimedia{
	
	// Attributes
	
	private int nbPlage;

	
	// constructor
	
	public CD() {
		super();
		this.nbPlage = Scanou.scanInteger("Combien de plage ?");
	}

	
	
	// Return
	
	@Override
	public String toString() {
		return "CD = "+ getTitre()+ " de "+getAuteur()+ ", d'une duree de "+ getDuree() + " minutes, de ref = "+ getReference()+" et "+getNbPlage()+" pistes";
	}


	// Getters and Setters


	public int getNbPlage() {
		return nbPlage;
	}


	public void setNbPlage(int nbPlage) {
		this.nbPlage = nbPlage;
	}
	
	
	
	
}
