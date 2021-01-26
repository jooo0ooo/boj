package _2178;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2178 {
	
	public static char[][] data;
	public static int[][] visit;
	public static int[] dX = {-1, 1, 0, 0};
	public static int[] dY = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		data = new char[n][m];
		for (int i = 0; i < n; i++) {
			data[i] = br.readLine().toCharArray();
		}
		visit = new int[n][m];
		
		bfs(n, m);
		
		bw.write(visit[n-1][m-1] + "");
		bw.flush();
		bw.close();
	}
	
	public static void bfs(int n, int m) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0,0});
		visit[0][0] = 1;
		
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextX = current[0] + dX[i];
				int nextY = current[1] + dY[i];
				if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && visit[nextX][nextY] == 0 && data[nextX][nextY] == '1') {
					queue.add(new int[] {nextX, nextY});
					visit[nextX][nextY] = visit[current[0]][current[1]] + 1;
				}
			}		
		}
	}
	
}