import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean a = true;
        
        while(a){
            Arrays.sort(wallet);
            Arrays.sort(bill);
            if(wallet[1] < bill[1]){
                bill[1] = bill[1] / 2;
                answer++;
            }else if(wallet[0] < bill[0]){
                bill[1] = bill[1] / 2;
                answer++;
            }else if(wallet[1] > bill[1]){
                a = false;
            }else if(wallet[1] == bill[1]){
                a = false;
            }
        }
        return answer;
    }
}