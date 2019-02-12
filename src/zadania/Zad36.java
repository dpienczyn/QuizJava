package zadania;

import java.util.Scanner;

public class Zad36 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Podaj dlugos promienia r: ");
		double dl;
		char odp = '?';
		do{
            System.out.println("Obliczanie dlugoœci okrêgu");
            double r;
		do{
			System.out.println("Podaj promien okregu r: ");
			r = s.nextDouble();
			dl = 2*Math.PI*r;
			
		}while(r<=0);
		System.out.printf("Dlugosc okregu wynosi L= %.2f ", dl);
		String e = s.nextLine();
		do{
            System.out.print("\nCzy obliczamy dalej (t/n)? ");
            e = s.nextLine();
            if (!e.isEmpty())
                odp = e.charAt(0);
		}while(e.isEmpty()||odp!='t'&&odp!='n');
		}while(odp=='t');
		s.close();
	}

}
