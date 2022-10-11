package sambungkata;

/**
 * Main program untuk permainan sambungkata
 */
import java.util.Scanner;  // Import the Scanner class

/**
 * @author MuhamadArifAdiputra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Silakan coba jalankan program ini terlebih dahulu untuk memastikan sudah bisa run dengan baik ya
		System.out.println("Halo Peserta DevCamp Tokopedia Academy 2022!");
		
		System.out.println("Selamat program nya sudah berjalan! Silakan eksplor ya!");
		
		boolean stillWantToPlay = true;
		
		while (stillWantToPlay) {
			
			
		    Scanner rawInput = new Scanner(System.in);  // Create a Scanner object
		    System.out.print("Masih mau main? (Y/N) :");

		    String userInput = rawInput.nextLine();  // Read user input
		    
		    if (userInput.equals("N")) {
		    	System.out.println("Okay, sampai jumpa lagi ya...");
		    	stillWantToPlay = false;
		    }
			
		}
		
	}

}
