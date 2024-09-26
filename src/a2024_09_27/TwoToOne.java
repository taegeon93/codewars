package a2024_09_27;

import java.util.stream.Collectors;

public class TwoToOne {
	
	public static String longest(String s1, String s2) {
		
		String temp = s1 +s2;
		
		
		
		return temp.chars().mapToObj(c -> (char) c) // 각 int 값을 char로 변환
			    .distinct() // 고유한 문자만 남김
			    .map(String::valueOf) // 각 문자를 문자열로 변환
			    .sorted()
			    .collect(Collectors.joining());
		
//		return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}
}
