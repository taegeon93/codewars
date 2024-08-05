package a2024_08_05;

public class CreditCardMask {
	public CreditCardMask(String str) {
	 String result = "";
		if(str.length()<4) {
			System.out.println(str);
		}else {
			for(int i =0;i<str.length()-4;i++) {
				result += "#";
			}
			result += str.substring(str.length()-4,str.length());
			System.out.println(result);
		}
		//return str.replaceAll(".(?=.{4})", "#"); 정규식 사용
	}
}
