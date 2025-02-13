import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
        int M = in.nextInt();
        int T = in.nextInt();
		in.close();
        H += T/60;
        M += T%60;
        if(M >=60){
            H += 1;
            M -= 60;
        }
        if(H >=24){
            H -= 24;
        }
        System.out.println(H + " " + M);
	}
}