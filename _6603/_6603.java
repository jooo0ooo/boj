package _6603;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _6603 {
	
	public static int n;
	public static int[] arr, print;
	public static boolean[] visited;
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				break;
			}
			arr = new int[n+1];
			print = new int[n+1];
			visited = new boolean[n+1];
			for (int i = 1; i <= n; i++) {
				print[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(1, 1);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();	
	}
	
	public static void dfs(int depth, int count) throws IOException {
		if (depth == 7) {
			for (int i = 1; i <= 6; i++) {
				bw.write(print[arr[i]] + " ");
			}
			bw.newLine();
		}
		
		for (int i = 1; i <= n; i++) {
			if(!visited[i] && count <= i) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}
}