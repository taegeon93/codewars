package a2024_09_24;

public class Order {

	public static String order(String words) {
		
		if(words.equals("")) {
			return "";
		}
		
		String[] tempWords = words.split(" ");
		
		String[] wordArrays = new String[tempWords.length];
		
		for(String item : tempWords) {
			char[] array = item.toCharArray();
			for(int i =0;i<array.length;i++) {
				if(array[i] > 48 && array[i] <= 57) {
					int index = Integer.parseInt(String.valueOf(array[i]));
					wordArrays[index-1] = item;
				}
			}
		}
		
		
		return String.join(" ", wordArrays);

//		best solution
//		정규식과 스트림 이용
//		return Arrays.stream(words.split(" "))
//			      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//			      .reduce((a, b) -> a + " " + b).get();
//			  }
	}
}