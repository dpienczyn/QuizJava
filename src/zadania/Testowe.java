package zadania;

public class Testowe {

	
	public static void main(String[] args) {
		char[] y = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		String h = new String(y);
        String[] letters = new String[]{h};
        
        
        int count = 0;
        
        String result = "";
        
        StringBuilder r = new StringBuilder();
        for(String letter : letters) {
        	
        	r.append(letter).append(result);
        	
        	
        	
        }
        
        System.out.println(r);
    }
}
