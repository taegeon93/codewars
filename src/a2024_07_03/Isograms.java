package a2024_07_03;

public class Isograms {
    public Isograms(String str){
        String upperCase = str.toUpperCase();
        boolean b =  true;
        if(str.equals("")){
            System.out.println(true);
        }else{
            for(int i =0;i<upperCase.length()-1;i++){
                int count =0;
                for(int j =i+1;j<upperCase.length();j++){
                    if(upperCase.charAt(i)==upperCase.charAt(j)) {
                        count++;
                        if (count == 1) {
                            System.out.println(false);
                            b = false;
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(b);
        // clever code
        //return str.length() == str.toLowerCase().chars().distinct().count();


    }
}
