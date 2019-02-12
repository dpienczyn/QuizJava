package zadania;

public class SzyfrVigener {

	public static void main(String[] args) {
		char alf[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int tab[][] = new int[26][26];

		for(int i=0; i<tab.length; i++){
			for(int y=0; y<tab[i].length; y++){
				
			
			tab[i][y]=alf[i];
			System.out.print(alf[i]);
		}
	}
	}
}
