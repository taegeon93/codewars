package a2024_06_30;

public class Get_the_Middle_Character {
    public Get_the_Middle_Character(String word){
        int idex = word.length()/2;
        String result ="";
        if(word.length()%2==0){
            result += word.charAt(idex-1);
            result += word.charAt(idex);
        }else{
            result += word.charAt(idex);
        }
        System.out.println(result);
//        subString 사용
//        String s = "";
//        int length = word.length();
//        int half = length/2;
//
//        if (length % 2 == 0) {
//
//            s = word.substring(half - 1, half + 1);
//
//        } else {
//
//            s = word.substring(half, half + 1);
//
//        }
//        int length = word.length();
//        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }
}
