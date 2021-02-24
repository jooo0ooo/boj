package _11652;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class _11652 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int maxVal = 0;
		long maxKey = 0;
		
		HashMap<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			long tempKey = Long.parseLong(br.readLine());
			int tempVal = 1;
			if (map.containsKey(tempKey)) {
				tempVal += map.get(tempKey);
			}
			map.put(tempKey, tempVal);
			
			if (tempVal > maxVal) {
				maxVal = tempVal;
				maxKey = tempKey;
			}
			
			if (tempVal == maxVal && tempKey < maxKey) {
				maxKey = tempKey;
			}
		}
		
		bw.write(maxKey + "");
		bw.flush();
		bw.close();
	}
}