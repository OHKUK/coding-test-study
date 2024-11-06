import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        
        Map<String, Integer> playersmap = new HashMap<>();
        Map<Integer, String> rankmap = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            // 플레이어 순위
            playersmap.put(players[i],i);
            // 순위 플레이어
            rankmap.put(i,players[i]);
        }
        
        for(int i =0; i < callings.length; i++){
            
            // 추월하는 플레이어와 현재순위
            int rank = playersmap.get(callings[i]);
            String player = rankmap.get(rank);
            
            String nextplayer = rankmap.get(rank - 1);
            
            // 현재 순위 변경
            playersmap.put(player, rank -1);
            playersmap.put(nextplayer, rank);
            
            rankmap.put(rank -1, player);
            rankmap.put(rank, nextplayer);
        }
        
        String[] playerRank = new String[players.length];
        for(int i = 0; i < players.length; i++){
            playerRank[i] = rankmap.get(i);
        }
        
        return playerRank;
    }
}