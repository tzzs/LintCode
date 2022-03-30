public class Solution {
    /**
     * @param maze: the maze
     * @return: Can they reunion?
     */
    public boolean findHer(String[] maze) {
        int m = maze.length;
        int n = maze[0].length();

        int sx = 0, sy = 0;
        int tx = 0, ty = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i].charAt(j) == 'S') {
                    sx = i;
                    sy = j;
                }

                if (maze[i].charAt(j) == 'T') {
                    tx = i;
                    ty = j;
                }
            }
        }

        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int[][] visited = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { sx, sy });
        visited[sx][sy] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    if (maze[x].charAt(y) == 'T') {
                        return true;
                    } else if (maze[x].charAt(y) == '.' && visited[x][y] == 0) {
                        queue.offer(new int[] { x, y });
                        visited[x][y] = 1;
                    }
                }
            }
        }

        return false;
    }
}
