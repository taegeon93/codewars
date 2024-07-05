package a2024_07_05;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Bit_Counting {
    public Bit_Counting(int n){

        String[] binaryNumber = Integer.toBinaryString(n).split("");
        String result =Arrays.stream(binaryNumber).filter(a->a.equals("1")).collect(Collectors.joining());
        System.out.println(result.length());

        // 베스트 코드와 마음에드는 코드
//        System.out.println(Integer.bitCount(n));
//        return (int) Integer.toBinaryString(n).chars()
//                .filter(c -> c == '1')
//                .count();
    }
}
