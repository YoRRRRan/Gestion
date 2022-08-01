package mediatheque;

public class Dvd extends Multimedia{
	
	// attributes
	
	private String bonus;

	
	// Constructor
	
	public Dvd() {
		super();
		this.bonus = Scanou.scanString("Combien a t'il de bonus ?");
	}

	// Return
	
	@Override
	public String toString() {
		return "DVD = "+ getTitre()+ " de "+getAuteur()+ ", d'une duree de "+ getDuree() + " minutes, de ref = "+ getReference()+" et "+this.bonus+" bonus.";
	}

	// Getters end Setters
	
	public String getBonus() {
		return bonus;
	}


	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	
	
	
}
