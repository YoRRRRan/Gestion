package gestion;

public class Employe {
	
	// Attributes
	protected String nom;
	private int age;
	protected double salaire;
	private int nbSecu;
	
	
	// Construtor
	
	public Employe(String nom, int age, double salaire, int nbSecu) {
		
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
		this.nbSecu = nbSecu;
		
	}
	
	// Fonction augmentation
	
	public void augmentation(double perCent)	{
		perCent = (this.salaire*(perCent));
		this.salaire = perCent;
	}
	
	
	// Return
	@Override
	public String toString() {
		return this.nom + " a un salaire de " +this.salaire+ " et une prime de ";
	}
	
	
	
	
	




	
	// getters and setters
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getNbSecu() {
		return nbSecu;
	}
	public void setNbSecu(int nbSecu) {
		this.nbSecu = nbSecu;
	}
	
	
}
