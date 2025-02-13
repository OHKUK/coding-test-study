import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
		in.close();
        int list_1[] = {A,B,C};
        Arrays.sort(list_1);
        int m = 0;
        if(A == B && B == C){
            m = 10000 + (A*1000);
            System.out.println(m);
        }else if (A == B || A == C){
            m = 1000 + (A*100);
            System.out.println(m);
        }else if (B == C){
            m = 1000 + (B*100);
            System.out.println(m);
        }else{
            m = (list_1[2]*100);
            System.out.println(m);
        }
	}
}