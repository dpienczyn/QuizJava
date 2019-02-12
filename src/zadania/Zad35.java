package zadania;

import java.util.Scanner;

public class Zad35 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj d³ugoœæ boku a: ");
		double a;
		double pole;
		
		do{
			a = s.nextDouble();
			if(a==0){
				System.exit(0);
			}
			else if(a<0){
				System.out.println("Podaj wartosc dodatnia boku a: ");
			}else if(a>0){
				pole = a*a*Math.sqrt(3)/4;
				System.out.printf("Pole trojkata wynosi: %.2f ",pole);
				System.out.println("\nPodaj d³ugoœæ boku a: ");
			}
			
		}while(true);

	}

}
