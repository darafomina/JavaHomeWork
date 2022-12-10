package Seminar2;

public class Main {
    private static String doSimpleString(String str) {
        //empty() - "" - true
        //"" != null - true
        //"     " - isBlank()
        //"     hello       " -> "hello" -> trim()
//        if (str.isBlank()) {
        if (str.trim().length() == 0) {
            return "";
        }

        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char prev= str.charAt(0);
        char curr = str.charAt(0);

        for (int i = 1; i < str.length() - 1; i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr != prev) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
        }
        return sb.toString();
    }
/*
    public static void main(String[] args) {
        System.out.println(buildString('X', 'o', 21));
        System.out.println(buildString());
    }
        private static String buildString(char c1, char c2, int length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    sb.append(c1);
                }
                else {
                    sb.append(c2);
                }
            }
            return sb.toString();
        }*/
}



