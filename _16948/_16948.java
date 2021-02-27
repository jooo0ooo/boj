package _16948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16948 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] visited = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = -1;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken()), c1 = Integer.parseInt(st.nextToken()), 
				r2 = Integer.parseInt(st.nextToken()), c2 = Integer.parseInt(st.nextToken());
				
		bfs(r1, c1, r2, c2, n, visited);
		
		bw.write(visited[r2][c2] + "");
		bw.flush();
		bw.close();
	}
	
	public static void bfs(int r1, int c1, int r2, int c2, int n, int[][] visited) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {r1, c1});
		visited[r1][c1] = 0;
		int[] dx = {-2, -2, 0, 0, 2, 2}, dy = {-1, 1, -2, 2, -1, 1};
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			for (int i = 0; i < 6; i++) {
				int nextX = current[0] + dx[i], nextY = current[1] + dy[i];
				
				if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && visited[nextX][nextY] == -1) {
					visited[nextX][nextY] = visited[current[0]][current[1]] + 1;
					q.add(new int[] {nextX, nextY});
				}
				
			}
		}
		
	}

}