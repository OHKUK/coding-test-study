import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        String arr[] = new String[n];
		
        for(int i = 0; i < n; i++){
            String str = in.next();
            
            arr[i] = str.substring(0,1) + str.substring(str.length()-1,str.length());
        }
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		in.close();
	}
}