import java.util.*;

class Solution {

    static class State {
        int r, c, mask, energy;

        State(int r, int c, int mask, int energy) {
            this.r = r;
            this.c = c;
            this.mask = mask;
            this.energy = energy;
        }
    }

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startR = 0, startC = 0;

        int[][] litterIndex = new int[m][n];
        for (int[] row : litterIndex) {
            Arrays.fill(row, -1);
        }

        int litterCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startR = i;
                    startC = j;
                }

                if (ch == 'L') {
                    litterIndex[i][j] = litterCount++;
                }
            }
        }

        if (litterCount == 0) {
            return 0;
        }

        int fullMask = (1 << litterCount) - 1;

        boolean[][][][] visited =
                new boolean[m][n][1 << litterCount][energy + 1];

        Queue<State> queue = new LinkedList<>();

        queue.offer(new State(startR, startC, 0, energy));
        visited[startR][startC][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                State curr = queue.poll();

                if (curr.mask == fullMask) {
                    return moves;
                }
                if (curr.energy == 0) {
                    continue;
                }

                for (int d = 0; d < 4; d++) {

                    int nr = curr.r + dr[d];
                    int nc = curr.c + dc[d];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }

                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    int newEnergy = curr.energy - 1;
                    int newMask = curr.mask;

                    char cell = classroom[nr].charAt(nc);

                    if (cell == 'L') {
                        int index = litterIndex[nr][nc];
                        newMask |= (1 << index);
                    }

                    if (cell == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newMask][newEnergy]) {

                        visited[nr][nc][newMask][newEnergy] = true;

                        queue.offer(
                            new State(
                                nr,
                                nc,
                                newMask,
                                newEnergy
                            )
                        );
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}