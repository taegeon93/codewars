package a2024_06_26;

public class Stop_gninnipS_My_sdroW {
    public Stop_gninnipS_My_sdroW(String sentence){
        String[] temp = sentence.split(" ");
        for(int i =0;i<temp.length;i++){
            if(temp[i].length()>=5) {
                temp[i] = new StringBuffer(temp[i]).reverse().toString();
            }
        }
        //stream 이용코드
        //return Arrays.stream(sentence.split(" "))
        //                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
        //                 .collect(Collectors.joining(" "));
        System.out.println(String.join(" ",temp));
    }

}
