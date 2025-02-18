import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int check[] = new int[26];
        String str = in.next();
        in.close();
        for(int i = 0; i < str.length();i++){
            if( 'A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                check[str.charAt(i) - 'A']++;
            }
            else{
                check[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';
        
        for(int i = 0; i < check.length; i++){
            if(check[i] > max){
                max = check[i];
                ch = (char) + (i+65);
            }else if(check[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
	}
}