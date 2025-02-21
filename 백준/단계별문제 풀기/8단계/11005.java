import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int tmp = 0;
        String str = "";
        while(n > 0){
            tmp= n % b;
            if(tmp >= 10){
                char c = (char) (tmp + 55);
                str += c;
            }else{
                str += tmp;
            }
            n = n / b;
        }
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        in.close();
    }
}