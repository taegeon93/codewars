package a2024_08_06;

public class PangramChecker {
	 
	public boolean check(String sentence){
		sentence = sentence.toLowerCase();
		for(int i =97;i<=122;i++) {
			if(sentence.indexOf((char)i) == -1) {
				return false;
			}
		}			
		return true;
	}
	// stream���� �ߺ��� ������ ���� �� ���� ���ĺ� ���� ������ ���
	//return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
}
