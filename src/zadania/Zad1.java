package zadania;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz dwie liczby ktore chcesz podzielic np. 23/2: ");
		String u =s.nextLine();
		int a = Integer.parseInt(u.substring(0, u.indexOf("/")));
		int b = Integer.parseInt(u.substring(u.indexOf("/")+1));
		double suma = (double)a/b;
		double procent = suma * 100.0;
		System.out.println(a);
		System.out.println(b);
		System.out.printf("Procent z tego u³amka wynosi: %.1f%%%n", procent);
		

	}

}
