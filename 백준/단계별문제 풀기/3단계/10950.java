import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		
        for(int i = 0; i < A; i++){
            int B = in.nextInt();
            int C = in.nextInt();
            System.out.println((B+C));
        }
		in.close();
	}
}