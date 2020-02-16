package _10820;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10820 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		int lowerCase = 0, upperCase = 0, number = 0, space = 0;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while((input = br.readLine()) != null) {
			
			for(int i = 0; i < input.length(); i++) {
				
				if(input.charAt(i) >= 97 && input.charAt(i) <= 122) {
					lowerCase++;
				} else if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
					upperCase++;
				} else if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
					number++;
				} else {
					space++;
				}
				
			}
			
			bw.write(lowerCase + " " + upperCase + " " + number + " " + space + "\n");
			
			lowerCase = 0;
			upperCase = 0;
			number = 0;
			space = 0;
		
		}
		
		bw.flush();
		bw.close();
		
	}

}
