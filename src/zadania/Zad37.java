package zadania;

import java.util.Scanner;

public class Zad37 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, m;
		
		do{
			System.out.println("Wprowadz liczbe: ");
			n = s.nextInt();
		}while(n<0);
		do{
			System.out.println("Wprowadz liczbe: ");
			m = s.nextInt();
		}while(m<0);
		while(n>0){
			--n;
			++m;
		}
		System.out.printf("Suma liczb %d\n", m);
	}

}
