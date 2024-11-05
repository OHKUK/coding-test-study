import java.io.*;
import java.util.*;

public class Main {

    private static int N; // 지도 크기
    private static int[][] map; // 지도
    private static boolean[][] visited; // 방문 여부
    private static List<Integer> blockSizes = new ArrayList<>(); // 블록 크기 리스트

    // 상하좌우 이동을 위한 배열
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        // 지도 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0'; // 문자열에서 정수로 변환
            }
        }

        // 블록 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    // 새로운 블록 발견
                    int size = dfs(i, j);
                    blockSizes.add(size); // 블록 크기 추가
                }
            }
        }

        // 결과 출력
        Collections.sort(blockSizes); // 오름차순 정렬
        System.out.println(blockSizes.size()); // 블록 수 출력
        for (int size : blockSizes) {
            System.out.println(size); // 각 블록의 크기 출력
        }
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 처리
        int count = 1; // 현재 블록의 크기

        // 4 방향 탐색
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 유효 범위 체크
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(nx, ny); // 재귀 호출하여 블록 크기 증가
                }
            }
        }

        return count; // 현재 블록 크기 반환
    }
}
