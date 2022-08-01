package GestionnaireApprenants;

import java.util.Scanner;

public class Utils {

	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère la chaîne entrée
	 *
	 * @param la question posée à l'utilisateur
	 * @return la chaîne obtenue

	 */
	public static String scanString(String question) {
		// Affiche une question.
		System.out.println(question);
		// Range la réponse dans la variable scan
		Scanner scan = new Scanner(System.in);
		// retour de la réponse obtenu
		return scan.nextLine();
			}
}
