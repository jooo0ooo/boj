package _1918;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class _1918 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			char index = input.charAt(i);
			switch (index) {
				case '+':
				case '-':
					if (stack.isEmpty() || stack.peek() == '(') {
						stack.push(index);
					} else {
						while (!(stack.isEmpty() || stack.peek() == '(')) {
							result += stack.pop();
						}
						stack.push(index);
					}
					break;
				case '*':
				case '/':
					if (stack.isEmpty() || (stack.peek() != '*' && stack.peek() != '/') || stack.peek() == '(') {
						stack.push(index);
					} else {
						result += stack.pop();
						stack.push(index);
					}
					break;
				case '(':
					stack.push(index);
					break;
				case ')':
					while (stack.peek() != '(') {
						result += stack.pop();
					}
					stack.pop();
					break;
				default:
					result += index;
					break;
			}
		}
		
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		
		bw.write(result);
		bw.flush();
		bw.close();
		
	}
}