import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
        in.close();
		int count = N/4;
        String str = "";
        for(int i = 0 ; i < count; i++){
            str += "long ";
        }
        System.out.println(str+"int");
	}
}