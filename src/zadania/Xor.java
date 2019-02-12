package zadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Xor {

	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/xortekst.txt");
		Scanner odczyt = new Scanner(f);
		Scanner o = new Scanner(System.in);
		String slowo = odczyt.nextLine();
		File file = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/kluczjednorazowy.txt");
		Scanner odczytaj = new Scanner(file);
		Scanner od = new Scanner(System.in);
		String klucz = odczytaj.nextLine();
		String tmp;
		
		char[] r = slowo.toCharArray();
		char[] k = klucz.toCharArray();

		StringBuilder str = new StringBuilder();
		for(int i=0; i<r.length; i++){
			
			tmp = Integer.toBinaryString(r[i]);
			int t = Integer.parseInt(tmp);
			System.out.println("Text "+t);
				String hy = Integer.toBinaryString(k[i]);
				int s = Integer.parseInt(hy);
				System.out.println("Klucz "+s);
				
					int w = r[i]^k[i];
					if(k.length<r.length){
						int u= r.length%k.length;
						
					}
					String ch = new Character((char) w).toString();
					
					System.out.println(ch);
					System.out.println(w);
					PrintWriter zapisuj = new PrintWriter("C:/Users/dominika/workspace/QuizPytania/bin/zadania/xorzaszyfrowany.txt");	
					str.append(ch);
					odczyt.close();
					zapisuj.print(str);
					zapisuj.close();
				}
			System.out.println(str);
			System.out.println("Czy chcesz odkodowaæ zdanie? Je¿eli tak to wciœnij 't' jak nie to 'n'");
			char t = o.nextLine().charAt(0);
			if(t=='t'){
				StringBuilder string = new StringBuilder();
				File plik = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/xorzaszyfrowany.txt");
				Scanner odczytajj = new Scanner(plik);
				Scanner p = new Scanner(System.in);
				String text = odczytajj.nextLine();
				System.out.println(text);
				char[] znak = text.toCharArray();
				char[] kl = klucz.toCharArray();
				for(int u=0; u<znak.length; u++){
					//znaki 
					String s = Integer.toBinaryString(znak[u]);
					int wx = Integer.parseInt(s, 2);
					//klucz
					String j = Integer.toBinaryString(kl[u]);
					int re = Integer.parseInt(j, 2);
					
					//odkodowywanie
					PrintWriter zapisz = new PrintWriter("C:/Users/dominika/workspace/QuizPytania/bin/zadania/xorodszyfrowany.txt");	
					int q = znak[u]^kl[u];
					String h = new Character((char) q).toString();
					System.out.println(h);
					string.append(h);
					zapisz.print(string);
					zapisz.close();
				}
			}
			}
			//System.out.println(tmp);
		
}

