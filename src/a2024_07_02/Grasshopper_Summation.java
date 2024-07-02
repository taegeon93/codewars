package a2024_07_02;

public class Grasshopper_Summation {
    public Grasshopper_Summation(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
//        stream 이용한 방식
//        IntStream.rangeClosed(1,n).sum();
    }
}
