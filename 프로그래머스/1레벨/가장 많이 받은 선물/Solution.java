import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        //친구 이름을 키로 하고, 친구의 인덱스를 값으로 하는 맵을 생성하여 각 친구의 위치 추적
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            map.put(friends[i],i);
        }
        // 각 친구의 선물 주고받는 횟수를 저장하는 배열
        int[] index = new int[friends.length];
        
        //기록 배열 i친구가 j친구한테 선물한 횟수
        int[][] record = new int[friends.length][friends.length];
        
        // 각 선물 기록 파싱처리
        for(String str : gifts){
            //공백으로 나눔
            String[] arrstr = str.split(" ");
            //보낸사람 인덱스 증가, 받은 사람 인덱스 감소
            index[map.get(arrstr[0])]++;
            index[map.get(arrstr[1])]--;
            
            //보낸 사람과 받은사람간 선물 기록 증가
            record[map.get(arrstr[0])][map.get(arrstr[1])]++;
        }
        // 받을양
        int ans = 0;
        
        // 다른친구들과 비교
        for(int i = 0; i < friends.length; i++){
            int cnt = 0;
            for(int j = 0; j < friends.length; j++){
                if(i == j){
                    //혼자 비교안함
                    continue;
                }
                //더많은 선물을 보냈으면 증가
                if(record[i][j] > record[j][i]){
                    cnt++;
                }else if(record[i][j] == record[j][i] && index[i] > index[j]){
                    //같으면 익덱스 배열 비교
                    cnt++;
                }
                //최대 기록
                ans = Math.max(cnt, ans);                
            }
        }
        
        
        int answer = 0;
        return ans;
    }
}