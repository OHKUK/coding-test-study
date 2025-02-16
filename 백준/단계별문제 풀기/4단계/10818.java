import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int a[] = new int [l];
        for(int i = 0; i < l; i++){
            a[i] = in.nextInt();
        }
		in.close();
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[l-1]);
	}
}