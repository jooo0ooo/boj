package _17299;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17299 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		int[] input = new int[size];
		HashMap<Integer, Integer> count = new HashMap<>();
		int[] result = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < size; i++) {
			input[i] = Integer.parseInt(st.nextToken());
			if (count.get(input[i]) != null) {
				count.put(input[i], count.get(input[i]) + 1);
			} else {
				count.put(input[i], 1);
			}
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < size; i++) {
			while (!stack.isEmpty() && count.get(input[i]) > count.get(input[stack.peek()])) {
				result[stack.pop()] = input[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		
		for (int i = 0; i < size; i++) {
			if (i + 1 == size) {
				bw.write(result[i]+"");
			} else {
				bw.write(result[i] + " ");
			}
			
		}
		
		bw.flush();
		bw.close();
	
	}
}