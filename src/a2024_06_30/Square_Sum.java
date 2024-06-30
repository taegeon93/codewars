package a2024_06_30;

public class Square_Sum {

    public Square_Sum(int[] n){

        int sum = 0;

        for(int idx : n){
            sum += idx*idx;
        }
        System.out.println(sum);
    }
}
