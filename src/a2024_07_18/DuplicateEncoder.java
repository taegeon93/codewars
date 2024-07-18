package a2024_07_18;

public class DuplicateEncoder {
    public DuplicateEncoder(String word){
        word = word.toLowerCase();
        String[] list = word.split("");
        String[] result =  new String[list.length];
        String result2="";

        for(int i =0;i<list.length;i++){
            for(int j =i+1;j<list.length;j++){
                if(list[i].equals(list[j])){
                    System.out.println(list[i]+" "+list[j]);
                    result[i] =")";
                    result[j] = ")";
                }
            }
        }
        for(int i=0;i<list.length;i++){
            if(result[i] != ")"){

                result[i]="(";
                result2 += result[i];
            }else{
                result2 += result[i];
            }
        }
        System.out.println(result2);

//        word = word.toLowerCase();
//        String result = "";
//        for (int i = 0; i < word.length(); ++i) {
//            char c = word.charAt(i);
//            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//        }
//        return result;
//
//        return word.toLowerCase()
//                .chars()
//                .mapToObj(i -> String.valueOf((char)i))
//                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
//                .collect(Collectors.joining());



    }
}
