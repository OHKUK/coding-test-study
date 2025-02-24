import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        boolean flag = true;
        for(int i = 1; i <= n; i++){

            if(n % i == 0){
                count ++;
                if(count == k){
                    flag = false;
                    System.out.println(i);
                }
            }
            
        }
        if(flag){
            System.out.println(0);
        }
        
        
        in.close();
    }
}

