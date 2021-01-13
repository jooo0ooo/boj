package _1182;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1182 {

	public static int n, m, sum, count;
	public static int[] arr, data;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		sum = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		visited = new boolean[n+1];
		data = new int[n+1];
		count = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i<= n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= n; i++) {
			m = i;
			dfs(1, 1);
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int depth, int check) {
		if (depth == m + 1) {
			int temp = 0;
			for (int i = 1; i <= m; i++) {
				temp += data[arr[i]];
			}
			if (temp == sum) {
				count++;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i] && i>= check) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
		
	}

}
