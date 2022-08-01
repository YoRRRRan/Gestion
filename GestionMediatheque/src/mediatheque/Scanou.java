package mediatheque;

import java.util.Scanner;

public abstract class Scanou {


	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String rep = scan.nextLine();
		// scan.close();
		return rep;
	}

	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer rep;
		try {
			Scanner scan = new Scanner(System.in);
			rep = scan.nextInt();
		} catch (Exception exception) {
			return 0;
		}

		// scan.close();
		return rep;
	}
}
