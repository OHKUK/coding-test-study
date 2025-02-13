import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
        int M = in.nextInt();
		in.close();
        if(M>=45){
            M = M-45;
            System.out.println(H + " " + M);
        }else if(M<45){
            M = M+15;
            if(H<1){
                System.out.println(23 + " " + M );
            }else{
                H = H-1;
                System.out.println(H + " " + M);
            }
            
        }
		
	}
}