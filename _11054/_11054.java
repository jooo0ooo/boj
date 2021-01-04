package _11054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11054 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dpL = new int[n];
		int[] dpR = new int[n];
		dpL[0] = 1;
		dpR[n-1] = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n; i++) {
			dpL[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dpL[j] + 1 > dpL[i]) {
					dpL[i] = dpL[j] + 1;
				}
			}
		}
		
		for (int i = n-2; i >= 0; i--) {
			dpR[i] = 1;
			for (int j = n-1; i < j; j--) {
				if (arr[i] > arr[j] && dpR[j] + 1 > dpR[i]) {
					dpR[i] = dpR[j] + 1;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dpL[i] + dpR[i] - 1);
		}
		
		bw.write(max + "");
		
		bw.flush();
		bw.close();
		
	}
}