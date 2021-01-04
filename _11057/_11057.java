package _11057;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11057 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][10];
		
		for (int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = j; k <= 9; k++) {
					dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i <= 9; i++) {
			result = (result + dp[n][i]) % 10007;
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		
	}
}