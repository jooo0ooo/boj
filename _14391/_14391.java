package _14391;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _14391 {

	public static int size, n, m, max;
	public static int[][] arr, data;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		data = new int[n][m];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				data[i][j] = Integer.parseInt(temp.charAt(j) + "");
			}
		}
		
		size = n * m;
		arr = new int[n][m];
		max = 0;
		
		dfs(0);
		
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth) {
		if (depth == size) {
			int temp = 0, sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (j == 0) {
						if (arr[i][j] == 0) {
							temp = data[i][j];
						}
					} else {
						if (arr[i][j] == 0 && arr[i][j-1] == 0) {
							temp = temp * 10 + data[i][j];
						}
						
						if (arr[i][j] != 0 && arr[i][j-1] == 0) {
							sum += temp;
							temp = 0;
						}
						
						if (arr[i][j] == 0 && arr[i][j-1] != 0) {
							temp = data[i][j];
						}
					}
					
					if (j == m - 1) {
						sum += temp;
						temp = 0;
					}
				}
			}
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (j == 0) {
						if (arr[j][i] == 1) {
							temp = data[j][i];
						}
					} else {
						if (arr[j][i] == 1 && arr[j-1][i] == 1) {
							temp = temp * 10 + data[j][i];
						}
						
						if (arr[j][i] != 1 && arr[j-1][i] == 1) {
							sum += temp;
							temp = 0;
						}
						
						if (arr[j][i] == 1 && arr[j-1][i] != 1) {
							temp = data[j][i];
						}
					}
					
					if (j == n - 1) {
						sum += temp;
						temp = 0;
					}
				}
			}
			
			max = Math.max(max, sum);
			return;
		}
		
		arr[depth / m][depth % m] = 0;
		dfs(depth + 1);
		arr[depth / m][depth % m] = 1;
		dfs(depth + 1);
	}
}