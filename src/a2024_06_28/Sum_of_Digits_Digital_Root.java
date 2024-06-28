package a2024_06_28;

public class Sum_of_Digits_Digital_Root {


    public static int digital_root(int n){
        int sum = 0;
        int count = 0;
        while (0<n){
            sum += n % 10;
            n /= 10;
            count++;
        }
        return 1 < count ? digital_root(sum) : sum;
        // 1) return (n != 0 && n%9 == 0) ? 9 : n % 9;
        // 너무 어렵게 생각함 ...
//        2) while(n > 9){
//            n = n/10 + n % 10;
//        }
//        return(n);
    }
}
