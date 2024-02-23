package a24_02_23;

public class Vowels {
	

	public static int getCount(String str) {
		int cunt = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('a' == str.charAt(i)) {
				cunt += 1;
			} else if ('e' == str.charAt(i)) {
				cunt += 1;
			} else if ('i' == str.charAt(i)) {
				cunt += 1;
			} else if ('o' == str.charAt(i)) {
				cunt += 1;
			} else if ('u' == str.charAt(i)) {
				cunt += 1;
			}

		}
		
		System.out.println(cunt);
		return cunt;
	}

}
