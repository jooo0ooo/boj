package _1935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class _1935 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		String input = br.readLine();
		double[] data = new double[size];
		Stack<Double> stack = new Stack<>();
		
		for (int i = 0; i < size; i++) {
			data[i] = Double.parseDouble(br.readLine());
		}
		
		for (int index = 0; index < input.length(); index++) {
			//A ~ Z : 65 ~ 90
			if (65 <= input.charAt(index) && input.charAt(index) <= 97) {
				stack.push(data[input.charAt(index) - 65]);				
			} else {
				double second = stack.pop(), first = stack.pop();
				switch (input.charAt(index)) {
					case '+':
							stack.push(first + second);
						break;
					case '-':
						stack.push(first - second);
						break;
					case '*':
						stack.push(first * second);
						break;
					case '/':
						stack.push(first / second);
						break;
				}
			}
		}
		
		bw.write(String.format("%.2f", stack.pop()));
		bw.flush();
		bw.close();
		
	}
}