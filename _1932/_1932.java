package _1932;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1932 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] data = new int[n][n];
		int[][] dp = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = data[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][j] = dp[i-1][j] + data[i][j];
				} else if (j == i) {
					dp[i][j] = dp[i-1][j-1] + data[i][j];
				} else {
					dp[i][j] = Math.max(dp[i-1][j-1] + data[i][j], dp[i-1][j] + data[i][j]);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp[n-1][i]);
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
		
	}
}