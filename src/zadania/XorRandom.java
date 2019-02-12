package zadania;

import java.io.PrintWriter;
import java.util.Random;

public class XorRandom {

	public static void main(String[] args) throws Exception{
		int kluc;
		StringBuilder r = new StringBuilder();
		Random ran = new Random();
		for(int v=0; v<50; v++){
			kluc = ran.nextInt(9);
			System.out.println(kluc);
			PrintWriter zap = new PrintWriter("C:/Users/dominika/workspace/QuizPytania/bin/zadania/kluczjednorazowy.txt");	
			r.append(kluc);
			zap.print(r);
			zap.close();
		}

	}

}
