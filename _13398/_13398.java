package _13398;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _13398 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dpL = new int[n];
		int[] dpR = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dpL[0] = arr[0];
		int max = dpL[0];
		for (int i = 1; i < n; i++) {
			dpL[i] = Math.max(arr[i], dpL[i-1] + arr[i]);
			max = Math.max(max, dpL[i]);
		}
		
		dpR[n-1] = arr[n-1];
		for (int i = n-2; i >= 0; i--) {
			dpR[i] = Math.max(arr[i], dpR[i+1] + arr[i]);
		}
		
		for (int i = 1; i < n-1; i++) {
			int temp = dpL[i-1] + dpR[i+1];
			max = Math.max(max,  temp);
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
		
	}
}