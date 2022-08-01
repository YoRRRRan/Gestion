package gestion;

public class Technicien extends Employe {

	private String grade;

	public Technicien(String nom, int age, double salaire, int nbSecu, String grade) {
		super(nom, age, salaire, nbSecu);
		// TODO Auto-generated constructor stub
		this.grade=grade;
	}
	
	double getPrime()	{
		
		double prime=this.getSalaire();
		
		if (this.grade=="A")	{
			prime = (this.getSalaire()+300);
		}
		if (this.grade=="B")	{
			prime = (this.getSalaire()+200);
		}
		if (this.grade=="C")	{
			prime = (this.getSalaire()+100);
		}
		return prime;
	}
	
	public String toString() {
		return this.nom + " a un salaire de " +this.salaire+ " et en ajoutant la prime, cela revient à " + getPrime()+this.grade;
	}
	
}
