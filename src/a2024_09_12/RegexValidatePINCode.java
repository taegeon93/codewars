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
//		forEach �� ���
		for(char el : pinCharArr) {
			if(48 > el || el > 57) {
				return false;
			}
		}
	//Character::isDigit char�� ���� �������� Ȯ���ϴ� �޼���
	//string.chars() String�� char�迭�� ��Ʈ�� ����
		
//		���ԽĻ�� Ǯ��
//		return pin.matches("\\d{4}|\\d{6}");
		
		return true;
	}
}
