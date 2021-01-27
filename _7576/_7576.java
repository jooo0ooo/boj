package _7576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7576 {

	public static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
	public static int n, m, result;
	public static int[][] box;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		box = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result = 0;
		bfs();
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 1) {
					q.add(new int[] {i, j});
				}
			}
		}
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int currentX = current[0], currentY = current[1];
			for (int i = 0; i < 4; i++) {
				int nextX = currentX + dx[i], nextY = currentY + dy[i];
				if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m && box[nextX][nextY] == 0) {
					q.add(new int[] {nextX, nextY});
					box[nextX][nextY] = box[currentX][currentY] + 1;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					result = -1;
					return;
				}
				result = Math.max(result, box[i][j] - 1);
			}
		}
		
	}
	
}