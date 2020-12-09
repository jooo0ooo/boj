package _10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] stack = new int[10000];
		int commandSize = Integer.parseInt(input.readLine()), stackSize = 0;
		
		for (int i = 0; i < commandSize; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			
			String command = st.nextToken();
			
			if (command.startsWith("push")) {
				stack[stackSize] = Integer.parseInt(st.nextToken());
				stackSize++;
			} else if (command.startsWith("pop")) {
				if (stackSize > 0) {
					bw.write(stack[stackSize - 1]+"");
				} else {
					bw.write(-1 + "");
				}
				bw.newLine();
				if (stackSize > 0) {
					stackSize--;
				}
			} else if (command.startsWith("size")) {
				bw.write(stackSize + "");
				bw.newLine();
			} else if (command.startsWith("empty")) {
				if (stackSize > 0) {
					bw.write(0 + "");
				} else {
					bw.write(1 + "");
				}
				bw.newLine();
			} else if (command.startsWith("top")) {
				if (stackSize > 0) {
					bw.write(stack[stackSize - 1] + "");
				} else {
					bw.write(-1 + "");
				}
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
