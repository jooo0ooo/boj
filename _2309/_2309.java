package _2309;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _2309 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int[] ans = new int[7];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		int first = 0, second = 0;
		Search :
		for (int i = 0; i < 9; i++) {
			first = i;
			for (int j = i+1; j < 9; j++) {
				second = j;
				if (arr[first] + arr[second] + 100 == sum) {
					break Search;
				}
			}
		}
		
		int index = 0;
		for (int i = 0; i < 9; i++) {
			if (i != first && i != second) {
				ans[index] = arr[i];
				index++;
			}
		}
		
		Arrays.sort(ans);
		for (int i = 0; i < 7; i++) {
			bw.write(ans[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}