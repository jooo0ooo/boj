package _1107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class _1107 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nString = br.readLine();
		int n = Integer.parseInt(nString);
		int m = Integer.parseInt(br.readLine());
		int result;
		
		if (n == 100) {
			result = 0;
		} else {
			boolean[] brokenBtn = new boolean[10];
			if (m != 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int i = 0; i < m; i++) {
					brokenBtn[Integer.parseInt(st.nextToken())] = true;
				}
			}
			
			
			result = Math.abs(n - 100);
			for (int i = 0; i <= 1000000; i++) {
				String numString = i + "";
				int iLen = numString.length();
				boolean flag = true;
				for (int j = 0; j < iLen; j++) {
					if (brokenBtn[numString.charAt(j) - '0']) {
						flag = false;
						break;
					}
				}
				
				if (flag) {
					int temp = iLen + Math.abs(n - i);
					if (result > temp) {
						result = temp;
					}
				}
			}
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
	
}