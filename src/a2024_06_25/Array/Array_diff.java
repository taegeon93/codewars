package a2024_06_25.Array;

import java.util.ArrayList;


public class Array_diff {

    public Array_diff(int[] a, int[] b) {
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        for(int i =0; i<a.length;i++){
            temp1.add(a[i]);
        }
        for(int i =0; i<b.length;i++){
            temp2.add(b[i]);
        }
        temp1.removeAll(temp2);
        int [] result = temp1.stream().mapToInt(i->i).toArray();

        //다른 예제 코드
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
//----------------------------------------------------------------
//        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
        for(int data:result){
            System.out.println(data);
        }
    }
}
