package a2024_08_02;

public class ConvertStringToCamelCase {
	public ConvertStringToCamelCase(String s) {
		
		String[] temp =s.indexOf("-")>0 ?  s.split("-"): s.split("_");
		String result = temp[0];
		for(int i = 1 ;i<temp.length;i++) {
			result += convertString(temp[i]);
		}
		System.out.println(result);
		
	
		
	}
	 private String convertString(String str) {
		    String firstLetter = str.substring(0, 1);
		    String remainLetter = str.substring(1);         
		    firstLetter = firstLetter.toUpperCase();
		    remainLetter = remainLetter.toLowerCase();      
		    String result = firstLetter + remainLetter;         
		    return result;
	 }
//		best solution
//	 static String toCamelCase(String str){
//		    String[] words = str.split("[-_]");
//		    return Arrays.stream(words, 1, words.length)
//		            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//		            .reduce(words[0], String::concat);

}
