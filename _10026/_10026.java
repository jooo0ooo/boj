package _10026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10026 {

	public static int n;
	public static char[][] paint;
	public static boolean[][] visited;
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		paint = new char[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			paint[i] = br.readLine().toCharArray();
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j, paint[i][j], false);
					count++;
				}
			}
		}
		
		bw.write(count + " ");
		
		count = 0;
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j, paint[i][j], true);
					count++;
				}
			}
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int x, int y, char color, boolean flag) {
		int[] dx = {-1, 0, 0, 1}, dy = {0, 1, -1, 0};
		
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i], nextY = y + dy[i];
			if (!flag && nextX >= 0 && nextX < n && nextY >= 0 && nextY < n 
					&& !visited[nextX][nextY] && paint[nextX][nextY] == color) {
				dfs(nextX, nextY, color, flag);				
			}
			
			if (flag && nextX >= 0 && nextX < n && nextY >= 0 && nextY < n 
					&& !visited[nextX][nextY]) {
				if ((color == 'R' || color == 'G') 
						&& (paint[nextX][nextY] == 'R' || paint[nextX][nextY] == 'G')) {
					dfs(nextX, nextY, color, flag);
				} else if (color == paint[nextX][nextY]) {
					dfs(nextX, nextY, color, flag);
				}
			}
		}
		
	}

}
