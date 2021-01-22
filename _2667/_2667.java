package _2667;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class _2667 {

	public static int n;
	public static char[][] graph;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		
		graph = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			graph[i] = br.readLine().toCharArray();
		}
		
		ArrayList<Integer> array = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == '1') {
					count++;
					array.add(dfs(i, j));
				}
			}
		}
		Collections.sort(array);
		
		bw.write(count + "\n");
		for (int data : array) {
			bw.write(data + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int dfs(int x, int y) {
		int count = 1;
		graph[x][y] = '0';
		
		if (x < n - 1 && graph[x+1][y] == '1') {
			count += dfs(x+1, y);
		}
		
		if (x > 0 && graph[x-1][y] == '1') {
			count += dfs(x-1, y);
		}
		
		if (y < n - 1 && graph[x][y+1] == '1') {
			count += dfs(x, y+1);
		}
		
		if (y > 0 && graph[x][y-1] == '1') {
			count += dfs(x, y-1);
		}
		
		return count;
	}
}