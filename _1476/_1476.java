package _1476;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1476 {

	public static int[] dp;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int eResult = Integer.parseInt(st.nextToken()), sResult = Integer.parseInt(st.nextToken()), mResult = Integer.parseInt(st.nextToken());
		
		int e = 1, s = 1,  m = 1, year = 1;
		
		while (!(e == eResult && s == sResult && m == mResult)) {
			e++;
			s++;
			m++;
			year++;
			
			if (e == 16) {
				e = 1;
			}
			
			if (s == 29) {
				s = 1;
			}
			
			if (m == 20) {
				m = 1;
			}
		}
		
		bw.write(year + "");
		bw.flush();
		bw.close();
	
	}
	
}