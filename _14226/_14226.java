package _14226;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class _14226 {

	public static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(br.readLine());
		
		visited = new boolean[1001][1001];
		
		bw.write(bfs(s) + "");
		bw.flush();
		bw.close();
	}
	
	public static int bfs(int end) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1, 1, 1});
		visited[1][1] = true;
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int display = current[0], clipboard = current[1], cnt = current[2];
			
			if (display == end) {
				return cnt;
			}
			
			if (!visited[display][display]) {
				visited[display][display] = true;
				q.add(new int[] {display, display, cnt + 1});
			}
			
			if (display + clipboard <= 1000 && !visited[display + clipboard][clipboard]) {
				visited[display + clipboard][clipboard] = true;
				q.add(new int[] {display + clipboard, clipboard, cnt + 1});
			}
			
			if (display - 1 != 0 && !visited[display - 1][clipboard]) {
				visited[display - 1][clipboard] = true;
				q.add(new int[] {display - 1, clipboard, cnt + 1});
			}
			
		}
		
		return -1;
	}
	
}