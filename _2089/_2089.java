package _2089;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class _2089 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int decimal = Integer.parseInt(br.readLine());
		
		if (decimal == 0) {
			bw.write("0");
		}
		
		while(decimal != 0) {
			
			int mod = decimal % -2;
			decimal = decimal / -2;
			if (mod < 0) {
				mod *= -1;
				decimal += 1;
			}			
			stack.push(mod);
		}
		
		while(!stack.isEmpty()) {
			bw.write(stack.pop() + "");
		}
		
		
		
		bw.flush();
		bw.close();
		
	}

}