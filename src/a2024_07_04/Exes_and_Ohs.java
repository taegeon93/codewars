package a2024_07_04;

public class Exes_and_Ohs {
    public Exes_and_Ohs(String str){
        int x = 0;
        int o = 0;

        String ox = str.toUpperCase();

        for(int i =0;i<ox.length();i++){
            if(ox.charAt(i)=='X'){
                x++;
            } else if (ox.charAt(i)=='O') {
                o++;
            }
        }

        System.out.println(x == o);
//        역으로 O와 X를 제거한 길이를 비교
//        return str.replace("O","").length() == str.replace("X","").length();
    }
}
