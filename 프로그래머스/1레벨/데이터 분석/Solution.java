import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] sort_val = {"code", "date", "maximum", "remain"};
        int extmain = 0;
        int sormain = 0;
        int[][] answer = new int[data.length][4];
        
        // 필드 인덱스 구하기
        for (int i = 0; i < 4; i++) {
            if (sort_val[i].equals(sort_by)) {
                sormain = i;
            }
            if (sort_val[i].equals(ext)) {
                extmain = i;
            }
        }

        // 필터링된 데이터를 answer 배열에 추가
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][extmain] < val_ext) {
                answer[count++] = data[i];
            }
        }

        // sormain을 effectively final로 만들기 위해 별도의 변수로 선언
        final int finalSormain = sormain;
        
        // answer 배열을 정렬
        Arrays.sort(answer, 0, count, Comparator.comparingInt(entry -> entry[finalSormain]));

        // 필요 없는 부분 제거
        return Arrays.copyOfRange(answer, 0, count);
    }
}