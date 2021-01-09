package _1654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		long[] arr = new long[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}		
		Arrays.sort(arr);
		
		long left = 1;
		long right = arr[k-1];
		long mid = 0;
		long result = 0;
		
		while (left <= right) {
			mid = (left + right) / 2;
			
			long cnt = 0;
			for (int i = 0; i < k; i++) {
				cnt += arr[i] / mid;
			}
			
			if (cnt >= n) {
				result = mid > result ? mid : result;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		
	}
}