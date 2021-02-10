package _1261;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1261 {
	
	public static char[][] map;
	public static boolean[][] visited;
	public static int[][] cost;
	public static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		visited = new boolean[n][m];
		cost = new int[n][m];
		
		for (int i = 0 ; i < n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		bfs(m, n);
		
		bw.write(cost[n-1][m-1] + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void bfs(int width, int height) {
		Deque<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0});
		visited[0][0] = true;
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int currentX = current[0], currentY = current[1];
			
			for (int i = 0; i < 4; i ++) {
				int nextX = currentX + dx[i], nextY = currentY + dy[i];
				
				if (nextX >= height || nextY >= width || nextX < 0 || nextY < 0 || visited[nextX][nextY]) {
					continue;
				}
				
				visited[nextX][nextY] = true;
				
				if (map[nextX][nextY] == '0') {
					q.push(new int[] {nextX, nextY});
					cost[nextX][nextY] = cost[currentX][currentY];
				} else {
					q.add(new int[] {nextX, nextY});
					cost[nextX][nextY] = cost[currentX][currentY] + 1;
				}
			}
		}
	}
	
}