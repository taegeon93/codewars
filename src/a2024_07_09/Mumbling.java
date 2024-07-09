package a2024_07_09;

public class Mumbling {
    public Mumbling(String s) {
        String[] temp = s.split("");
        String[] result = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            String ex = "";
            for (int j = 0; j < i + 1; j++) {
                ex += j == 0 ? temp[i].toUpperCase() : temp[i].toLowerCase();
            }
            result[i] = ex;
        }
        System.out.println(String.join("-",result));
//        String[] letters = s.toUpperCase().split("");
//        for(int i = 0; i < letters.length; ++i){
//            letters[i] += letters[i].toLowerCase().repeat(i);
//        }
//        return String.join("-", letters);
        //--------------------------------------------------
//        StringBuilder bldr = new StringBuilder();
//        int i = 0;
//        for(char c : s.toCharArray()) {
//            if(i > 0) bldr.append('-');
//            bldr.append(Character.toUpperCase(c));
//            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
//            i++;
//        }
//        return bldr.toString();
    }
    }
}
