package a2024_09_12;

import java.util.Arrays;
import java.util.stream.Stream;

public class RegexValidatePINCode {
	  
	public static boolean validatePin(String pin) {
		int length =  pin.length();
		
		if(length != 4 && length !=6) {
			return false;
		}
		char[] pinCharArr = pin.toCharArray();
//		forEach 문 사용
		for(char el : pinCharArr) {
			if(48 > el || el > 57) {
				return false;
			}
		}
	//Character::isDigit char의 값이 숫자인지 확인하는 메서드
	//string.chars() String을 char배열로 스트림 생성
		
//		정규식사용 풀이
//		return pin.matches("\\d{4}|\\d{6}");
		
		return true;
	}
}
