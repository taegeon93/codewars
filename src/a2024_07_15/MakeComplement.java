package a2024_07_15;

public class MakeComplement {
    public MakeComplement(String dna) {
        StringBuffer temp = new StringBuffer(dna);

        for (int i = 0; i < temp.length(); i++) {
            temp.setCharAt(i, indexChage(temp.charAt(i)));
        }
        System.out.println(temp.toString());
    }

    public char indexChage(char index) {
        switch (index) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            default:
                return 'c';
        }
    }
}
