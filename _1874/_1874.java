package _1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		ArrayList<String> history = new ArrayList<>();
		
		int index = 1;
		for (int i = 0; i < size; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if (stack.isEmpty()) {
				stack.push(index);
				history.add("+");
				index++;
			}
			
			while (stack.peek() < n) {
				stack.push(index);
				history.add("+");
				index++;
			}
			
			if (stack.peek() == n) {
				stack.pop();
				history.add("-");
			}
			
		}
		
		if (stack.empty()) {
			for(String data : history) {
				bw.write(data + "\n");
			}
		} else {
			bw.write("NO");
		}
		
		bw.flush();
		bw.close();
		
	}
}