package _17087;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _17087 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		int position[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {			
			position[i] = Math.abs(Integer.parseInt(st.nextToken()) - s);
		}
		
		int gcd = position[0];
		
		for (int i = 1; i < n; i++) {
			int big = gcd > position[i] ? gcd : position[i], small = gcd == big ? position[i] : gcd;
			int mod = big % small;
			gcd = small;
			
			while (mod != 0) {
				int temp = gcd % mod;
				gcd = mod;
				mod = temp;
			}
		}
		
		bw.write(gcd + "");
		
		bw.flush();
		bw.close();
		
	}

}
