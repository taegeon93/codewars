package a2024_09_27;

import java.util.stream.Collectors;

public class TwoToOne {
	
	public static String longest(String s1, String s2) {
		
		String temp = s1 +s2;
		
		
		
		return temp.chars().mapToObj(c -> (char) c) // �� int ���� char�� ��ȯ
			    .distinct() // ������ ���ڸ� ����
			    .map(String::valueOf) // �� ���ڸ� ���ڿ��� ��ȯ
			    .sorted()
			    .collect(Collectors.joining());
		
//		return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}
}
