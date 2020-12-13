package _1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class _1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		LinkedList<Character> text = new LinkedList<>();
		
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			text.add(input.charAt(i));
		}
		
		int commandNum = Integer.parseInt(br.readLine());
		
		ListIterator<Character> iter = text.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		
		for (int i = 0; i < commandNum; i++) {
			String command = br.readLine();
			
			if ("L".equals(command) && iter.hasPrevious()) {
				iter.previous();
			}
			
			if ("D".equals(command) && iter.hasNext()) {
				iter.next();
			}

			if ("B".equals(command) && iter.hasPrevious()) {
				iter.previous();
				iter.remove();
			}
			
			if (command.startsWith("P")) {
				iter.add(command.charAt(2));
			}
			
		}
		
		for(Character chr : text) {
			bw.write(chr);
		}
		
		bw.flush();
		bw.close();
		
	}
}