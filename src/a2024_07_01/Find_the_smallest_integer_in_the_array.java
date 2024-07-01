package a2024_07_01;

import java.util.Arrays;

public class Find_the_smallest_integer_in_the_array {

    public Find_the_smallest_integer_in_the_array(int[] args){

        int min = args[0];
        //stream을 이용한 풀이
        System.out.println(Arrays.stream(args).min().getAsInt());
        // for문 활용
        for(int i =0;i< args.length;i++){
            min = Math.min(min,args[i]);
        }
        System.out.println(min);

        // sort 활용
//        Arrays.sort(args);
//        return args[0];
    }
}
