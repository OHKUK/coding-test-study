import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int number = in.nextInt();
        int count[] = new int[l];
        for(int i = 0; i < number; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            for(int j = a-1; j < b; j++){
                count[j] = c;
            }
        }
		in.close();
        for(int i : count){
            System.out.print(i+" ");
        }
	}
}