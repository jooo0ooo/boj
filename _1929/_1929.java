package _1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1929 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		boolean[] pN = new boolean[n + 1];
		
		pN[0] = false;
		pN[1] = false;
		
		for (int i = 2; i <= n; i++) {
			pN[i] = true;
		}
		
		for (int i = 2; i * i <= n; i++) {
			if (pN[i]) {
				for (int j = i * i; j <= n; j += i) {
					pN[j] = false;
				}
			}
		}
		
		for (int i = m; i <= n; i++) {
			if (pN[i]) {
				bw.write(i + "");
				if (i != n) {
					bw.newLine();
				}
			}
		}		
		
		bw.flush();
		bw.close();
		
	}
}