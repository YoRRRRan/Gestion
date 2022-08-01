package gestion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe employe1 = new Employe("Jean", 32, 2000, 11);
		employe1.augmentation(1.3);
		System.out.println(employe1);
		Technicien technicien1 = new Technicien("Michel", 67, 2500, 12,"A");
		technicien1.augmentation(1);
		technicien1.getPrime();
		
		System.out.println(technicien1);
		
		
	}

}
