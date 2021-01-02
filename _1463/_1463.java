package _1463;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1463 {

	public static int[] dp;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		dp = new int[1000001];
		
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		bw.write(getMin(n) + "");
		bw.flush();
		bw.close();
	
	}
	
	public static int getMin(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n <= 4) {
			return dp[n];
		}
		
		if (dp[n] != 0) {
			return dp[n];
		}
		
		if (n % 3 == 0 && n % 2 == 0) {
			dp[n] =  Math.min(getMin(n / 3) + 1, getMin(n / 2) + 1);
		} else if (n % 3 == 0) {
			dp[n] =  Math.min(getMin(n / 3) + 1, getMin(n - 1) + 1);
		} else if (n % 2 == 0) {
			dp[n] = Math.min(getMin(n / 2) + 1, getMin(n - 1) + 1);
		} else {
			dp[n] = getMin(n - 1) + 1;
		}
		
		return dp[n];
	}
	
}