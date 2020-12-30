package _9095;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _9095 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] data = new int[10];
		data[0] = 1;
		data[1] = 2;
		data[2] = 4;
		
		for (int i = 3; i < 10; i++) {
			data[i] = data[i-1] + data[i-2] + data[i-3];
		}
		
		int size = Integer.parseInt(br.readLine());
		for (int i = 0; i < size; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(data[n-1] + "");
			if (i + 1 != size) {
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}