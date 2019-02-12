package zadania;

import java.util.Scanner;

public class Zad38 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,n;
		System.out.println("Podaj liczbe: ");
		m = s.nextInt();
		System.out.println("Podaj liczbe: ");
		n = s.nextInt();
		
		while(n>0){
			--n;
			++m;
		}
		while(n<0){
			++n;
			--m;
		}
		System.out.println(m);
	}

}
