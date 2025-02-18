import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int check[] = {1, 1, 2, 2, 2, 8};
        int arr[] = new int[check.length];
        for(int i = 0; i < check.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < check.length; i++){
            check[i] = check[i] - arr[i];
        }
        for(int i : check){
            System.out.print(i +" ");
        }
	}
}