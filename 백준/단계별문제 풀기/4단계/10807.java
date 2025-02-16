import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int a[] = new int [l];
        for(int i = 0; i < l; i++){
            a[i] = in.nextInt();
        }
   		int n = in.nextInt();
        int count = 0;
        for(int i = 0; i < l; i++){
            if(a[i] == n){
                count++;
            }
        }
		in.close();
        System.out.println(count);
	}
}