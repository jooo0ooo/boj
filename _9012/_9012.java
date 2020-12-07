package _9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[Integer.parseInt(input.readLine())];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.readLine();
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < arr.length; i++) {
			
			int left = 0, right = 0;
			char[] element = arr[i].toCharArray();
			
			for(int j = 0; j < element.length; j++) {
				if (element[j] == '(') {
					left++;
				} else {
					right++;
				}
				
				if (right > left) {
					break;
				}
				
			}
			
			if (left == right) {
				bw.write("YES");
			} else {
				bw.write("NO");
			}
			
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
