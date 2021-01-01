package _14002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _14002 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[size];
		int[] dp = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 1;
		int maxIndex = 0;
		dp[0] = 1;
		
		for (int i = 1; i < size; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
			max = Math.max(max, dp[i]);
			if (max == dp[i]) {
				maxIndex = i;
			}
		}
		
		bw.write(max + "\n");
		
		for (int i = maxIndex + 1; i < size; i++) {
			dp[i] = 0;
		}
		
		int temp = max;
		for (int i = maxIndex - 1; i >= 0; i--) {
			if (dp[i] + 1 != temp) {
				dp[i] = 0;
			} else {
				temp--;
			}
		}
		
		for (int i = 0; i < size; i++) {
			if (dp[i] != 0) {
				bw.write(arr[i] + "");
				if (i + 1 != size) {
					bw.write(" ");
				}
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}