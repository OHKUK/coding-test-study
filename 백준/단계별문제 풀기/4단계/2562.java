import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int a[] = new int [9];
        int b[] = new int [9];
        for(int i = 0; i < 9; i++){
            a[i] = in.nextInt();
            b[i] = a[i];
        }
		in.close();
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < 9; i++){
            if(b[i] == a[8] ){
                count = i+1;
            }
        }
        System.out.println(a[8]);
        System.out.println(count);
	}
}