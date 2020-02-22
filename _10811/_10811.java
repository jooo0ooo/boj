package _10811;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10811 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[size];
		int[] arrCopy = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i + 1;
			arrCopy[i] = i + 1;
		}
		
		for(int l = 0; l < time; l++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			
			for(int k = i; k <= j; k++) {
				arr[k - 1] = arrCopy[j - (k - i) - 1];
			}
			
			for(int k = 0; k < size; k++) {
				arrCopy[k] = arr[k];
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < size; i++) {
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
		bw.close();
		
	}

}
