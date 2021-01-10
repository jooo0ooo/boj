package _2758;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2758 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long[][] dp = new long[11][2001];
		
		for (int i = 1; i <= 2000; i++) {
			dp[1][i] = i;
		}
		
		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 2000; j++) {
				dp[i][j] = dp[i-1][j/2] + dp[i][j-1];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			bw.write(dp[n][m] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}