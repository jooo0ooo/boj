package _7562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7562 {
	
	public static int[] dx = {-2, -1, -2, -1, 1, 2, 1, 2}, dy = {1, 2, -1, -2, 2, 1, -2, -1};
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int l = Integer.parseInt(br.readLine());
			int[][] board = new int[l][l];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken()), startY = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int endX = Integer.parseInt(st.nextToken()), endY = Integer.parseInt(st.nextToken());
			
			if (startX != endX || startY != endY) {
				bfs(board, l, startX, startY, endX, endY);
			}
			
			int result = board[endX][endY];
			bw.write((result == 0 ? result : result -1) + "\n");
			
		}
		
		
		bw.flush();
		bw.close();
		
	}
	
	public static void bfs(int[][] board, int size, int startX, int startY, int endX, int endY) {
		board[startX][startY] = 1;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {startX, startY});
		
		while(!q.isEmpty()) {
			int[] current = q.poll();
			int currentX = current[0], currentY = current[1];
			for (int i = 0; i < 8; i++) {
				int nextX = currentX + dx[i], nextY = currentY + dy[i];
				
				if (nextX >= 0 && nextY >= 0 && nextX < size && nextY < size && (board[nextX][nextY] == 0 || board[currentX][currentY] + 1 < board[nextX][nextY])) {
					board[nextX][nextY] = board[currentX][currentY] + 1;
					q.add(new int[] {nextX, nextY});
				}
				
			}
		}	
	}
	
}