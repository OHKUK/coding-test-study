import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
        int B = in.nextInt();
        int B_1 = B%10;
        int B_10 = (B-B_1)%100/10;
        int B_100 = (B-B_10)/100;
        System.out.println(A*B_1);
        System.out.println(A*B_10);
        System.out.println(A*B_100);
        System.out.println(A*B);
		in.close();
	}
}
