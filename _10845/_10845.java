package _10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class _10845 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < size; i++) {
			String command = br.readLine();
			
			if (command.startsWith("push")) {
				queue.add(Integer.parseInt(command.split(" ")[1]));
			}
			
			if ("pop".equals(command)) {
				if (queue.peek() == null) {
					bw.write("-1\n");
				} else {
					bw.write(queue.poll() + "\n");
				}
			}
			
			if ("size".equals(command)) {
				bw.write(queue.size() + "\n");
			}
			
			if ("empty".equals(command)) {
				if (queue.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}
			
			if ("front".equals(command)) {
				if (queue.peek() == null) {
					bw.write("-1\n");
				} else {
					bw.write(queue.peek() + "\n");
				}
			}
			
			if ("back".equals(command)) {
				if (queue.peekLast() == null) {
					bw.write("-1\n");
				} else {
					bw.write(queue.peekLast() + "\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}