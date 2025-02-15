import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
        in.close();
        String str = "*";
        for(int i = 0 ; i < N; i++){
            System.out.println(str);
            str += "*";
        }
	}
}