package GestionnaireApprenants;

import java.util.ArrayList;

// Attributes

public class Apprenant {
	
    private String prenom;
    private String nom;
    // création et initialisation de liste de la classe Coordonnee
    private ArrayList<Coordonnee> coordonnees = new ArrayList<Coordonnee>();
    // Constructor qui affiches 2 question et l'enregistre dans 2 variables différentes et
    // affiche la fonction addCo
    public Apprenant() {
        this.prenom = Utils.scanString("Entrez un prenom : ");
        this.nom = Utils.scanString("Entrez un nom : ");
        // execute la fonction/méthode addCoordonnees
        addCoordonnees();
    }
    // Constructor des coordonnées
    public void addCoordonnees() {
        String next;
        // Création d'une boucle
        do {
            System.out.println("Rajoutez les coordonnées : ");
            // affiche la Classe Coordonnee et enregistre les valeurs dans l'objet coordonnees
            this.coordonnees.add(new Coordonnee());
            // affiche la question et range la réponse dans la variable next
            next = Utils.scanString("Continuez (Y/n) ? ");
            // tant que la variable next ne contient pas "n" ça boucle
        } while (!next.equals("n"));
    }
    	// retour 
    public String toString() {
    	// affichage du prenom et du nom renseigné par l'utilisateur + une ligne pour afficher le mot Coordonnées
        String retour = this.prenom + " " + this.nom + "\nCoordonnées : \n";
        // Affiche le retour de Coordonnée 
        for (Coordonnee coord : coordonnees) {
            retour += coord + "\n";
        }
        return retour;
    }
}
