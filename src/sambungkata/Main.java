/**
 * 
 */
package sambungkata;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author MuhamadArifAdiputra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
      char answer;
	  
	  while (true) {
        start();
        
        System.out.print("Lanjutkan permainan? [Y/N]: ");
        answer = sc.next().charAt(0);
        
        if (answer != 'Y') {
          break;
        }
	  }
	  
	  sc.close();
	}
	
	public static void start() {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.print("Masukkan kata pertama: ");
	  String firstInput = scanner.nextLine();
	  
	  System.out.printf("Potongan kata = %s\n", wordFragment(firstInput));
	  
	  System.out.print("Masukkan kata kedua: ");
	  String secondInput = scanner.nextLine();

      System.out.printf("Potongan kata = %s\n", wordFragment(secondInput));
     
      return; 
	}
	
	public static String wordFragment(String word) {
	  Set<Character> vocals = new HashSet<Character>();
	  vocals.add('a');
	  vocals.add('i');
	  vocals.add('u');
	  vocals.add('e');
	  vocals.add('o');
	  
	  StringBuilder result = new StringBuilder();
	  result.append(word.charAt(word.length() - 1));
	  
	  for (int i = word.length() - 2; i > 0; i--) {
	    char currentChar = word.charAt(i);
	    
	    if (vocals.contains(currentChar)) {
	        result.insert(0, currentChar);
	    } else {
	      result.insert(0, currentChar);
	      break;
	    }
	  }
	  
	  return result.toString();
	}

}
