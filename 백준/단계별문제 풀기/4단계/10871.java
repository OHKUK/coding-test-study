import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
        int x = in.nextInt();
		int a[] = new int [l];
        for(int i = 0; i < l; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < l; i++){
            if(a[i] < x){
                System.out.println(a[i]);
            }
        }
		in.close();
        
	}
}