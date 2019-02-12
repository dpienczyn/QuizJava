package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Zad39 {
	int pkt=0;

	private static final String[] pyt = { "1. Ile lat ¿yje pawian gwinejski?", 
			"2. Rekin bia³y ma bardzo czu³y wêch. Potrafi wyczuæ jedn¹ kroplê krwi w ____ wody.",
			"3. Wieloryby s¹ najwiêkszymi zwierzêtami zamieszkuj¹cymi _____?",
			"4. Gatunek wê¿a z rodziny dusicieli, wystêpuj¹cy w ___________?",
			"5. U du¿ych krokodyli mózg zajmuje do _____ objêtoœci puszki mózgowej."		
	};

	private static final String[] odp = {"\n1. 30-40 \n2. 50-60 \n3. 15-20 \n4. 10-15", 
			"\n1. 115 l \n2. 50 l \n3. 100 l \n4. 200 l", "\n1. Ziemiê \n2. Ocean \n3. Atlantyk \n4. Morze",
			"\n1. Ameryce Pó³nocnej \n2. Ameryce Po³udniowej \n3. Afryce \n4. Azji",
			"\n1. 60% \n2. 20% \n3. 30% \n4. 80%"			
	};

	private static final String[] or = {
			"3. 15-20", "1. 115 l", "1. Ziemiê", "2. Ameryce Po³udniowej", "1. 60%"
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
		System.out.println("Odpowiesz na kilka pytañ?");
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

				System.out.println("OdpowiedŸ nie jest prawid³owa");
				System.out.println();
			}
			int t = Integer.parseInt(r.substring(0));

			if(t!=1&&t!=2&&t!=3&&t!=4){
				System.out.println("Taka odpowiedŸ nie istnieje.. ");
				System.out.println();
				System.out.println("************Spróbuj jeszcze raz!************");
				System.exit(0);
			}
		}
		System.out.printf("Twoje punkty: %d",z.punkty()-1);
	}
}