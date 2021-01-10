
package _10971;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10971 {
	
	public static int n, result;
	public static int[] arr;
	public static boolean[] visited;
	public static int[][] cost;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		visited = new boolean[n];
		result = 10000000;
		cost = new int[n][n];
		
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		dfs(0);
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth) {
		
		if (depth == n) {
			arr[n] = arr[0];
			int temp = 0;
			for (int i = 0; i < n; i++) {
				int costCheck = cost[arr[i]][arr[i+1]];
				if (costCheck == 0) {
					temp = result;
				} else {
					temp += costCheck;
				}	
			}
			result = Math.min(result, temp);
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
		
	}

}