import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, d = 0;

        for(int i = 0; i < m * n; i++) {

            result.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if(nr >= 0 && nr < m &&
               nc >= 0 && nc < n &&
               !visited[nr][nc]) {

                r = nr;
                c = nc;
            }
            else {
                d = (d + 1) % 4;
                r += dr[d];
                c += dc[d];
            }
        }

        return result;
    }
}