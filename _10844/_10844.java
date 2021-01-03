package _10844;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10844 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][10];
		
		for (int i = 1; i <= 9; i++) {
			dp[0][i] = 1;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					dp[i][j] = dp[i-1][j+1] % 1000000000;
				} else if (j == 9) {
					dp[i][j] = dp[i-1][j-1] % 1000000000;
				} else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
				}
			}	
		}
		
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum = (sum + dp[n - 1][i]) % 1000000000;
		}
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
		
	}
}