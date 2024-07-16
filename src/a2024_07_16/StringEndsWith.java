package a2024_07_16;

public class StringEndsWith {
    public static boolean solution(String str, String ending){

        int maxIndex = str.length();
        int lastIndex = str.lastIndexOf(ending);
        System.out.println(maxIndex);
        System.out.println(str.lastIndexOf(ending));
        if(lastIndex >-1){
           return  maxIndex == lastIndex+ending.length()? true : false;
        }

        return false;
//        substring을 이용해 문자열을 잘라내 비교하는 방식
//        return str.length() >= ending.length() ?
//                str.substring(str.length()-ending.length()).equals(ending) : false;
//        특정문자로 끝난거나 시작하는지 알수 있는 메서드
//        return str.endsWith(ending);    마지막
//        return str.startsWith(ending);  시작
    }
}
