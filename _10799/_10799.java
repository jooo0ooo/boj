package _10799;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		int left = 0, result = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char data = input.charAt(i);
			if (i != 0 && (input.charAt(i - 1) == '(' && data == ')')) {
				left--;
				result += left;
				continue;
			}
			
			if (data == '(') {
				left++;
			}
			
			if (data == ')') {
				left--;
				result += 1;
			}
		}
		
		bw.write(result + "");
		
		bw.flush();
		bw.close();
	}

}
