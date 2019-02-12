package zadania;

import java.util.Scanner;

public class KolkoKrzyzyk {

	public static void main(String[] args) {
		int gracz1;
		int gracz2;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Gre rozpoczyna gracz1: ");
		int table[][]=new int[3][3];
		//malowanie tablicy
		System.out.println();
		System.out.println();
		System.out.println("    1 2 3");
		System.out.println("a   " + table[0][0]+ "|" + table[0][1]+ "|" + table[0][2]);
		System.out.println("b   " + table[1][0]+ "|" + table[1][1]+ "|" + table[1][2]);
		System.out.println("c   " + table[2][0]+ "|" + table[2][1]+ "|" + table[2][2]);
		
		int g1, g2;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.println("Wybierz jedn¹ z opcji wpisuj¹c odpowiedni¹ cyfre: ");
				g1= s.nextInt();
				System.out.println(g1);
				if(g1==table[i][0]&&g1==table[i][1]&&g1==table[i][2]){
					System.out.println("X"+table[i][j]);
					
				}
				
			}
		}
		
	}

}
