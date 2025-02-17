import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int str_1 = in.nextInt();
		int str_2 = in.nextInt();
		in.close();
        
		str_1 = Integer.parseInt(new StringBuilder().append(str_1).reverse().toString());
		str_2 = Integer.parseInt(new StringBuilder().append(str_2).reverse().toString());
        
        System.out.print(str_1 > str_2 ? str_1 : str_2);

	}
}