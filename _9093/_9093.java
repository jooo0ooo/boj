package _9093;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _9093 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < num; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				
				String word = st.nextToken();
				
				for(int j = 0; j < word.length(); j++) {
					
					bw.write(word.charAt(word.length() - 1 - j));
				
				}
				
				bw.write(" ");
			
			}
			
			bw.write("\n");
		
		}
		
		bw.flush();
		bw.close();
		
	}
}