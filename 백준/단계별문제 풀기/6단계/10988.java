import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        int check = 1;
        for(int i = 0; i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                check = 0;
            }
        }
        System.out.println(check);
	}
}