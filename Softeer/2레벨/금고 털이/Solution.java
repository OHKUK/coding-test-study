import java.io.*;
import java.util.*;

public class Main {   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()); // 배낭의 최대 무게
        int n = Integer.parseInt(st.nextToken()); // 귀금속의 종류 수
        int[][] mp = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            mp[i][0] = Integer.parseInt(st.nextToken()); // 금속의 무게
            mp[i][1] = Integer.parseInt(st.nextToken()); // 무게당 가격
        }
        
        Arrays.sort(mp, (o1, o2) -> o2[1] - o1[1]);

        int totalW = 0;
        // 총 금액
        int totalP = 0;
        
        for (int i = 0; i < n; i++){
            // 금속 자르지 않고 챙길 때
            if (totalW + mp[i][0] <= w){
                totalW += mp[i][0];
                totalP += mp[i][0]*mp[i][1];
            } else {
                // 금속을 자르고 챙길 때
                totalP += (w - totalW)*mp[i][1];
                break;
            }
        }
        System.out.print(totalP);
    }

}
