package _10973;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10973 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int i = n - 1, j = i;
		
		while (i > 0) {
			if (arr[i] < arr[i-1]) {
				break;
			}
			i--;
		}
		
		if (i == 0) {
			bw.write("-1");
		} else {
			while (j > 0) {
				if (arr[j] < arr[i -1]) {
					break;
				}
				j--;
			}
			
			int temp = arr[i-1];
			arr[i-1] = arr[j];
			arr[j] = temp;
			
			j = n - 1;
			while (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
			for (int k = 0; k < n; k++) {
				bw.write(arr[k] + " ");
			}
			
		}
		
		bw.flush();
		bw.close();
	}

}