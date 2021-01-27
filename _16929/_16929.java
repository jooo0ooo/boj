package _16929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _16929 {

	public static int n, m, startX, startY;
	public static boolean result;
	public static char[][] board;
	public static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		result = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited = new boolean[n][m];
				if (!visited[i][j] && !result) {
					startX = i;
					startY = j;
					dfs(i, j, 1);
				}
			}
		}
		
		bw.write(result ? "Yes" : "No");
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int x, int y, int count) {
		if (result) {
			return;
		}
		visited[x][y] = true;
		
		if (x > 0 && board[x-1][y] == board[x][y]) {
			if (x-1 == startX && y == startY && count >= 4) {
				result = true;
				return;
			}
			
			if (!visited[x-1][y]) {
				dfs(x-1, y, count+1);
			}
		}

		if (x + 1 < n && board[x+1][y] == board[x][y]) {
			if (x+1 == startX && y == startY && count >= 4) {
				result = true;
				return;
			}
			
			if (!visited[x+1][y]) {
				dfs(x+1, y, count+1);
			}
		}
		
		if (y > 0 && board[x][y-1] == board[x][y]) {
			if (x == startX && y-1 == startY && count >= 4) {
				result = true;
				return;
			}
			
			if (!visited[x][y-1]) {
				dfs(x, y-1, count+1);
			}
		}
		
		if (y + 1 < m && board[x][y+1] == board[x][y]) {
			if (x == startX && y+1 == startY && count >= 4) {
				result = true;
				return;
			}
			
			if (!visited[x][y+1]) {
				dfs(x, y+1, count+1);
			}
		}
		
	}

}
