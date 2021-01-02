package _15990;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _15990 {

	public static long[][] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new long[4][100001];
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][3] = 1;
		dp[2][3] = 1;
		dp[1][3] = 1;
		
		for (int i = 4; i <= 100000; i++) {
			dp[1][i] = (dp[2][i-1] + dp[3][i-1]) % 1000000009;
			dp[2][i] = (dp[1][i-2] + dp[3][i-2]) % 1000000009;
			dp[3][i] = (dp[1][i-3] + dp[2][i-3]) % 1000000009;
		}
		
		for (int i = 0; i < n; i++) {
			int data = Integer.parseInt(br.readLine());
			bw.write((dp[1][data] + dp[2][data] + dp[3][data]) % 1000000009 + "");
			if (i + 1 != n) {
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
