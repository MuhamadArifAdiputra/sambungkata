
package sambungkata;
import java.util.Scanner;

/**
 * @author MuhamadArifAdiputra
 *
 */
public class Main {

	/**
	 * @param args
	 */

	 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan kata pertama : ");
		String kata1 = input.nextLine();
		System.out.println("Masukkan kata kedua : ");
		String kata2 = input.nextLine();

		Integer index = 0;

		for(int i = kata1.length() - 2; i > 0; i--) {
				if ( kata1.charAt(i) != 'A' || kata1.charAt(i) != 'I' || kata1.charAt(i) != 'U' || kata1.charAt(i) != 'E' || kata1.charAt(i) != 'O') {
					index = i;
					break;
				}
			};
		
		if ( ((kata1.substring(index, kata1.length())).toLowerCase()).equals((kata2.substring(0, kata1.length() - index)).toLowerCase()) ){
			System.out.println("Kata pertama dan kedua dapat disambung");
		} else {
			System.out.println("Kata pertama dan kedua tidak dapat disambung");
		};
		};
	}
