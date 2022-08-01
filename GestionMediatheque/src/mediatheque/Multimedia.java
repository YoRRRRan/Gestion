package mediatheque;


public class Multimedia extends Support{

	// Attributes
	
	protected String duree;
	
	// Constructor
	
	public Multimedia() {
		super();
		this.duree = Scanou.scanString("Quelle est la duree ?");
	}

	@Override
	public String toString() {
		return super.toString() + " - Multimedia [Duree=" + duree + "]";
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	
	
	
}
