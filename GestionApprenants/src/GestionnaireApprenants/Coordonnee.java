package GestionnaireApprenants;

import java.util.ArrayList;
import java.util.List;
	
	
public class Coordonnee {
	// Attributes
	// Création de la liste types avec les éléments (string) de la liste
    static ArrayList<String> types = new ArrayList<String>(List.of(
            "téléphone",
            "email",
            "adresse",
            "fax",
            "Num Sécu"	));
            	
    // Attributes de 2 variables en private pour ne pas pouvoir les modifier de l'extérieur
    private String type;
    private String valeur;
    
    // Constructor
    public Coordonnee() {
    	// Création de la variable réponse
        String rep;
        // Création de la variable question 
        String question = "Choisir un type :\n";
        // boucle qui affiche la liste types avec des sauts à la lignes
        for (String t : types) {
            question += "- " + t + "\n";
        }
        
        // affiche la question et récupere la réponse dans la variable rep
        do {
            rep = Utils.scanString(question);
        //boucle une fois tant que la réponse n'est pas egale au types ça continue
        } while (!types.contains(rep));
        // on mets la variable rep dans type 
        this.type = rep;
        // on rajoute la reponse ds la variable question valeur
        this.valeur = Utils.scanString("Quel est son " + rep + " ?");
    }
    	// retour de la question et de la réponse
    public String toString() {
        return this.type + " : " + this.valeur;
    }
}
