package _1158;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1158 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()),
				k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> cq = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			cq.add(i + 1);
		}
		
		int index = k - 1;
		for (int i = 0; i < n; i++) {
			
			if (i == 0) {
				bw.write("<");
			}
			
			if (index >= cq.size()) {
				index = index % cq.size();
			}
			
			bw.write(cq.get(index) + "");
			cq.remove(index);
			
			index += k - 1;
			
			if (cq.size() == 0) {
				bw.write(">");
			} else {
				bw.write(", ");
			}
			
		}
		
		bw.flush();
		bw.close();
		
	}
	
}