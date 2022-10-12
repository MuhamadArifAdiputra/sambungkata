/**
 * 
 */
package sambungkata;

class CustomPair {

	String[] arr;

	public CustomPair(String s1, String s2) {
		arr = new String[2];
		arr[0] = s1;
		arr[1] = s2;
	}

	public String sambung() {
		int y0 = findLastVowel(arr[0]);
		if (y0 < arr[0].length() - 1)
			y0 += 1;

		int x0 = y0 - 1;
		for (int i = x0; i >= 0; i--) {
			x0 = i;
			if (arr[0].charAt(i) != 'a' &&
					arr[0].charAt(i) != 'e' &&
					arr[0].charAt(i) != 'i' &&
					arr[0].charAt(i) != 'o' &&
					arr[0].charAt(i) != 'u')
				break;
			else if (i == 0)
				x0 = -1;
		}

		if (x0 == -1)
			return "";

		String substring = arr[0].substring(x0, y0 + 1);
		System.out.println(substring);
		if (arr[1].contains(substring) && substring.charAt(0) == arr[1].charAt(0))
			return substring;
		else
			return "";

	}

	public int findLastVowel(String s) {
		int[] indexes = {
				s.lastIndexOf('a'),
				s.lastIndexOf('e'),
				s.lastIndexOf('i'),
				s.lastIndexOf('o'),
				s.lastIndexOf('u')
		};

		int maxIndex = -1;
		for (int i = 0; i < indexes.length; i++) {
			maxIndex = Math.max(indexes[i], maxIndex);
		}

		return maxIndex;
	}

}

/**
 * @author MuhamadArifAdiputra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomPair cPair = new CustomPair("changgi", "ganteng");
		System.out.println("Kata sambungan: " + cPair.sambung());
	}

}
