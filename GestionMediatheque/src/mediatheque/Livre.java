package mediatheque;

public class Livre extends Support{
	
	// Attributes
	
	private int nbPage;

	// Constructor
	public Livre() {
		super();
		this.nbPage = Integer.decode(Scanou.scanString("Quelle est le nombre de pages ?"));
	}

	// Return
	
	@Override
	public String toString() {
		return super.toString() + "Livre = "+ getTitre()+ " de "+getAuteur()+ " avec "+ nbPage + " pages, de ref = "+ getReference();
	}
	

	// Getters and Setters
	
	public int getNbPage() {
		return nbPage;
	}

	

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	
	
}
