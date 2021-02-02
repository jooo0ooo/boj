package _2146;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2146 {

	public static int n;
	public static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
	public static int[][] input, group, dist;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		input = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int label = 1;
		group = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (input[i][j] == 1 && group[i][j] == 0) {
					bfsGrouping(i, j, label);
					label++;
				}
			}
		}
		
		bfsCalcDist();
		
		int answer = n * 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 4; k++) {
					int currentX = i, currentY = j, 
							nextX = i + dx[k], nextY = j + dy[k];
					if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && group[currentX][currentY] != group[nextX][nextY]) {
						answer = Math.min(answer, dist[currentX][currentY] + dist[nextX][nextY]);
					}
					
				}
			}
		}
		
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
	
	public static void bfsGrouping(int x, int y, int label) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		group[x][y] = label;
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextX = current[0] + dx[i], nextY = current[1] + dy[i];
				
				if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && input[nextX][nextY] == 1 && group[nextX][nextY] == 0) {
					group[nextX][nextY] = label;
					q.add(new int[] {nextX, nextY});
				}
			}
		}	
	}
	
	public static void bfsCalcDist() {
		dist = new int[n][n];
		Queue<int[]> q = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j] = -1;
				if (input[i][j] == 1) {
					dist[i][j] = 0;
					q.add(new int[] {i, j});
				}
			}
		}
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = current[0] + dx[i], nextY = current[1] + dy[i];
				if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && dist[nextX][nextY] == -1) {
					dist[nextX][nextY] = dist[current[0]][current[1]] + 1;
					group[nextX][nextY] = group[current[0]][current[1]];
					q.add(new int[] {nextX, nextY});
				}
			}
		}
	}
}