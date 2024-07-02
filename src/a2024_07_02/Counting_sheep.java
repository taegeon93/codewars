package a2024_07_02;

public class Counting_sheep {
    public Counting_sheep(Boolean[] arrayOfSheeps){
        int sum = 0;
        for(int i =0; i <arrayOfSheeps.length;i++){
            if(arrayOfSheeps[i]!=null&&arrayOfSheeps[i]){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
