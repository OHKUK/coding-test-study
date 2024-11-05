import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int ssvideolen = timelength(video_len);
        int sspos = timelength(pos);
        int ssopstart = timelength(op_start);
        int ssopend = timelength(op_end);
        int result = 0;
        
            
        for(int i = 0; i < commands.length; i++){
            if(ssopstart <= sspos && sspos < ssopend){
                sspos = ssopend;
            }else if(sspos >= ssvideolen){
                sspos = ssvideolen;
            }
        
            if(commands[i].equals("next")){
               sspos = sspos + 10;
               if(ssopstart <= sspos && sspos <= ssopend){
                    sspos = ssopend;
               }else{
                    sspos = sspos;
               }
               }else{
                    sspos = sspos - 10;
               if(ssopstart <= sspos && sspos <= ssopend){
                    sspos = ssopend;
               }else{
                    sspos = sspos;
               }
            }
        }
        
        String MM = "";
        String SS = "";
        if(sspos >= ssvideolen){
            sspos = ssvideolen;
        }else if(sspos <= 0){
            sspos = 0;
        }
            if(sspos / 60 < 10){
                MM = "0"+ String.valueOf(sspos/ 60);
            }else{
                MM = String.valueOf(sspos/ 60);
            }
            if(sspos % 60 < 10){
                SS = "0" + String.valueOf(sspos % 60);
            }else{
                SS =  String.valueOf(sspos % 60);
            }
        
        
        answer = MM + ":" + SS;
        
        //System.out.println(ssvideolen);
        
        return answer;
    }
    
    public int timelength(String time){
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }
}