package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Zad39 {
	int pkt=0;

	private static final String[] pyt = { "1. Ile lat �yje pawian gwinejski?", 
			"2. Rekin bia�y ma bardzo czu�y w�ch. Potrafi wyczu� jedn� kropl� krwi w ____ wody.",
			"3. Wieloryby s� najwi�kszymi zwierz�tami zamieszkuj�cymi _____?",
			"4. Gatunek w�a z rodziny dusicieli, wyst�puj�cy w ___________?",
			"5. U du�ych krokodyli m�zg zajmuje do _____ obj�to�ci puszki m�zgowej."		
	};

	private static final String[] odp = {"\n1. 30-40 \n2. 50-60 \n3. 15-20 \n4. 10-15", 
			"\n1. 115 l \n2. 50 l \n3. 100 l \n4. 200 l", "\n1. Ziemi� \n2. Ocean \n3. Atlantyk \n4. Morze",
			"\n1. Ameryce P�nocnej \n2. Ameryce Po�udniowej \n3. Afryce \n4. Azji",
			"\n1. 60% \n2. 20% \n3. 30% \n4. 80%"			
	};

	private static final String[] or = {
			"3. 15-20", "1. 115 l", "1. Ziemi�", "2. Ameryce Po�udniowej", "1. 60%"
	};
	public int punkty(){
		pkt++;
		return pkt;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		Zad39 z = new Zad39();
		String r;
		System.out.println();
		System.out.println("***********************QUIZ**********************");
		System.out.println();
		System.out.println("Odpowiesz na kilka pyta�?");
		System.out.println();
		System.out.println("Zaczynamy!");
		System.out.println();
		for(int i = 0; i<pyt.length; i++){
			System.out.println(pyt[i]);
			System.out.println(odp[i]);
			r = s.nextLine();		
			if(r.charAt(0)==or[i].charAt(0)){

				System.out.println("Odpowiedz prawidlowa");
				z.punkty();

			}else{

				System.out.println("Odpowied� nie jest prawid�owa");
				System.out.println();
			}
			int t = Integer.parseInt(r.substring(0));

			if(t!=1&&t!=2&&t!=3&&t!=4){
				System.out.println("Taka odpowied� nie istnieje.. ");
				System.out.println();
				System.out.println("************Spr�buj jeszcze raz!************");
				System.exit(0);
			}
		}
		System.out.printf("Twoje punkty: %d",z.punkty()-1);
	}
}