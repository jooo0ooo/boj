package _17103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _17103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		boolean[] pN = new boolean[1000001];
		pN[0] = false;
		pN[1] = false;
		
		for (int i = 2; i < 1000001; i++) {
			pN[i] = true;
		}
		
		for (int i = 2; i * i < 1000001; i++) {
			if (pN[i]) {
				for (int j = i + i; j < 1000001; j += i) {
					pN[j] = false;
				}
			}
		}
		
		for (int i = 0; i < t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 2; j <= (n / 2); j++) {
				if (pN[j] && pN[n - j]) {
					count++;
				}
			}
			bw.write(count + "");
			
			if (i + 1 != t) {
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
