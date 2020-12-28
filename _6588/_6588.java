package _6588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _6588 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] pN = new boolean[1000001];
		pN[0] = false;
		pN[1] = false;
		
		for (int i = 2; i <= 1000000; i++) {
			pN[i] = true;
		}
		
		for (int i = 2; i * i <= 1000000; i++) {
			if (pN[i]) {
				for (int j = i * i; j <= 1000000; j += i) {
					pN[j] = false;
				}
			}
		}
		
		int input = Integer.parseInt(br.readLine());
		while (input != 0) {
			
			boolean flag = false;
			for (int i = 2; i <= input; i++) {
				if (pN[i]) {
					if (pN[input-i]) {
						bw.write(input + " = " + i + " + " + (input - i));
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				bw.write("Goldbach's conjecture is wrong.");
			}
			bw.newLine();
			input = Integer.parseInt(br.readLine());			
		}
		
		bw.flush();
		bw.close();	
	}
}