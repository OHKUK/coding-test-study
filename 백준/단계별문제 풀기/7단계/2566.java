import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int a[][] = new int[9][9];
        int tmp = -1;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(a[i][j] > tmp){
                    tmp = a[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(tmp);
        System.out.println(x+" "+y);
	}
}

