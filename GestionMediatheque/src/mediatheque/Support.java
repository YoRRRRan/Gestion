package mediatheque;

abstract class Support {
	
	// Attributes
	
	private String Auteur;
	private String Titre;
	private String Reference;
	
	// Constructor
	
	public Support() {
		super();
		this.Auteur = Scanou.scanString("Quel est l'auteur ?");
		this.Titre = Scanou.scanString("Quel est le titre ?");
		this.Reference = Scanou.scanString("Quel est la reference ?");
	}
	
	
	// Return
	
	@Override
	public String toString() {
		return "";
	}

	// Getters and Setters
	
	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		Reference = reference;
	}


	public int getNbPage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
