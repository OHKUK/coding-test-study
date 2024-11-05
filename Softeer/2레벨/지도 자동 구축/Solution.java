import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
 

        int answer = 2;
        for (int i = 0 ; i < n ; i++) {
        
            answer *= 2;
            answer -= 1;
        }

        System.out.println(answer*answer);
    }
}
