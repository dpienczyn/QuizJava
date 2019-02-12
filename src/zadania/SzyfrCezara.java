package zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SzyfrCezara {
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/tekst.txt");
		Scanner odczyt = new Scanner(f);
		Scanner o = new Scanner(System.in);
		String slowo = odczyt.nextLine();
		byte[] b = slowo.getBytes();
		System.out.println("Podaj klucz: ");
		int klucz = o.nextInt();
		if(klucz>26||klucz<1){
			System.out.println("Spróbuj jeszcze raz! Wybierz klucz z przedzia³u od 1 do 26..");
			System.exit(0);
		}
		PrintWriter zapis = new PrintWriter("C:/Users/dominika/workspace/QuizPytania/bin/zadania/zakodowany.txt");	
		for(byte n: b){
			int h=0;
			int k1 = 65-klucz;
			int k2 = 97-klucz;
			if(n==32){
				h = n;
			}if(n>=65&&n<=90){
				h=65+(n-k1)%26;
			}if(n>=97&&n<=122){
				h=97+(n-k2)%26;
			}
				System.out.println((char)h);
				zapis.print((char)h);
		}		
		odczyt.close();
		zapis.close();
		
		System.out.println("Czy chcesz odkodowaæ zdanie? Je¿eli tak to wciœnij 't' jak nie to 'n'");
		char t = o.next().charAt(0);
		if(t=='t'){
			File plik = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/zakodowany.txt");
			Scanner odczytaj = new Scanner(plik);
			Scanner p = new Scanner(System.in);
			String text = odczytaj.nextLine();
			System.out.println(text);
			byte[] j = text.getBytes();
			PrintWriter zapisuj = new PrintWriter("C:/Users/dominika/workspace/QuizPytania/bin/zadania/odkodowany.txt");	
			for(byte z: j){
				int a=0;
				int k;
				k= 26-klucz;
				int k3 = 65-k;
				int k4 = 97-k;
				if(z==32){
					a=z;
					System.out.println(z);
				}if(z>=65&&z<=90){
					a=65+(z-k3)%26;
				}if(z>=97&&z<=122){
					a=97+(z-k4)%26;
				}
				System.out.println((char)a);
				zapisuj.print((char)a);
			}
			p.close();
			zapisuj.close();
		}else
			System.out.println("Koniec");
		
		
		
		System.out.println(slowo);
	}
}