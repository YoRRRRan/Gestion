package GestionContact;
import java.util.Scanner;

public class Scanou {
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
