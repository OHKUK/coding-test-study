import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int h = park.length;    // 행 개수
        int w = park[0].length();  // 열 개수

        // 공원 문자열을 2차원 문자 배열
        char[][] parks = new char[h][w];
        
        //시작 위치를 찾음
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                parks[i][j] = park[i].charAt(j);
                
                // 시작점 위치
                if(parks[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                } 
            }
        }

        // 방향 배열 설정
        int[] dh = {-1, 0, 1, 0};
        int[] dw = {0, 1, 0, -1};
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('E', 1);
        map.put('S', 2);
        map.put('W', 3);
        
        for(int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);  // 방향 문자 (N, E, S, W 중 하나)
            int value = Integer.parseInt(routes[i].substring(2));  // 이동 거리
            
            int index = map.get(direction);
            
            boolean check = true;
            
            // 이동 경로계산
            int nh = answer[0];  
            int nw = answer[1];  
            
            for(int j = 0; j < value; j++) {
                nh += dh[index];  // 행 위치를 한 칸 이동
                nw += dw[index];  // 열 위치를 한 칸 이동
                
                // 공원을 벗어나거나 장애물에 도달하는지 확인
                if(nh >= h || nh < 0 || nw >= w || nw < 0 || parks[nh][nw] == 'X') {
                    check = false;  // 유효하지 않은 경로일 경우
                    break;
                }
            }
            
            // 유효한 경로인 경우에만 시작 위치를 업데이트
            if(check) {
                answer[0] = nh;
                answer[1] = nw;
            }
        }

        return answer;
    }
}
