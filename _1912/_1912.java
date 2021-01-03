package _1912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1912 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		int max = dp[0];
		
		for (int i = 1; i < n; i++) {
			if (arr[i] > dp[i-1] + arr[i]) {
				dp[i] = arr[i];
			} else {
				dp[i] = dp[i-1] + arr[i];
			}
			
			max = Math.max(max, dp[i]);
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
		
	}
}