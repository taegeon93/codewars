package a2024_09_26;

public class JadenCase {
	
	public static String toJadenCase(String phrase) {
	
		if(phrase == null || phrase.equals("")) {
			return null;
		}
		
		String[] words = phrase.split(" ");
		String[] tempWords = new String[words.length];
		int i = 0;
		for(String word:words) {
			StringBuilder temp = new StringBuilder(word);
			String first = String.valueOf(temp.charAt(0)).toUpperCase();
			temp.setCharAt(0, first.charAt(0));
			tempWords[i] = temp.toString();
			++i;
		}
		i = 0;
		return String.join(" ",tempWords);
		
		
//		return Arrays.stream(phrase.split(" "))
//                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
//                .collect(Collectors.joining(" "));
	}
}
