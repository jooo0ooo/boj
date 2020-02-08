package _2745;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2745 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		int digit = Integer.parseInt(st.nextToken());
		
		char sArr[] = s.toCharArray();
		int sum = 0;
		int digitNum = 1;
		
		for(int i = s.length() - 1; i >= 0; i--) {
			
			int num;
			
			if(sArr[i] < 58) {
			
				num = sArr[i] - 48;
			
			} else {
			
				num = sArr[i] - 55;
			
			}
			
			sum += (num * digitNum);
			digitNum *= digit;
		
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(sum + "");
		
		bw.flush();
		bw.close();
	}

}