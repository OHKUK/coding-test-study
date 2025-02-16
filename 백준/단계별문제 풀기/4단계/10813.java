import java.util.*;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = in.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < number; i++){
            arr[i] = i+1;
        }
        int index = 0;
        for(int i = 0; i < count; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            index = arr[b-1];
            arr[b-1] = arr[a-1];
            arr[a-1] = index;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
	}
}