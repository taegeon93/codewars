package a2024_07_11;

public class CountingDuplicates {
    public CountingDuplicates(String text) {
        int result = 0;
        int length = 0;

        text = text.toLowerCase();
        while ((length = text.length()) > 0) {
            char c = text.charAt(0);
            text = text.replace(Character.toString(c), "");
            if (length - 1 != text.length()) {
                result += 1;
            }
        }
        System.out.println(result);
    }
//    int ans = 0;
//    text = text.toLowerCase();
//    while (text.length() > 0) {
//        String firstLetter = text.substring(0,1);
//        text = text.substring(1);
//        if (text.contains(firstLetter)) ans ++;
//        text = text.replace(firstLetter, "");
//    }
//    return ans;
}

