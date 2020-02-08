package _11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11653 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(num == 1) {
			bw.write("1\n");
		}
		
		for(int i = 2; i <= num; i++) {
			
			if(num / i == 0) {
			
				bw.write(num % i + "\n");
			
			} else {
			
				if(num % i == 0) {
				
					bw.write(i + "\n");
					
					num /= i;
					i = 1;
				}
				
			}
			
		}
		
		bw.flush();
		bw.close();
		
	}
}