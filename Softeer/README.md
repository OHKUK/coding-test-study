import java.util.Scanner;

public class Main {

    public static String makeS(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        boolean first = true;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (!first) {
                    result.append('+'); 
                }
                result.append('(');
                result.append('1'); 
                first = false;
            } else if (ch == ')') {
                result.append(')');
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = makeS(S1);
        System.out.println(S2);
        sc.close();
    }
}