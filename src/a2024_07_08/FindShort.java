package a2024_07_08;

import java.util.Arrays;

public class FindShort {
    public FindShort(String s){
       String[] temp = s.split(" ");

       int[] temp2 = new int [temp.length];

       for(int i =0; i<temp.length;i++){
           temp2[i] = temp[i].length();
       }
        System.out.println(Arrays.stream(temp2).min().getAsInt());

//       best
//        Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();

    }
}
