package a2024_06_24;


import java.util.Arrays;

public class Descending_Order {

    public  Descending_Order(int num) {
        String sNum = num + "";
        String result ="";
        int[] arrays = new int[sNum.length()];
        for (int i = 0; i < sNum.length(); i++) {
            arrays[i] = sNum.charAt(i) - '0';
        }
        Arrays.sort(arrays);
        for(int i = 0; i < arrays.length/2;i++){
            int temp = arrays[i];
            arrays[i] = arrays[arrays.length -i -1];
            arrays[arrays.length-i-1] = temp;
        }
        for (int j = 0; j < arrays.length; j++) {
            result += arrays[j];
        }

        System.out.println(Integer.parseInt(result));
// 제일 좋은 예라 생각되는 코드
//        public class DescendingOrder {
//            public static int sortDesc(final int num) {
//                String[] array = String.valueOf(num).split("");
//                Arrays.sort(array, Collections.reverseOrder());
//                return Integer.valueOf(String.join("", array));
//            }
//        }
    }
}
