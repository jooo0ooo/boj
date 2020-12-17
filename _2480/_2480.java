package _2480;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		Arrays.sort(num);
		
		if (num[0] == num[1] && num[0] == num[2]) {
			bw.write(10000 + num[0] * 1000 + "");
		} else if ((num[0] == num[1] && num[0] != num[2]) || (num[0] == num[2] && num[0] != num[1]) || (num[1] == num[2] && num[0] != num[1])) {
			if (num[0] == num[1]) {
				bw.write(num[0] * 100 + 1000 + "");
			} else {
				bw.write(num[2] * 100 + 1000 + "");
			}
		} else if (num[0] != num[1] && num[0] != num[2] && num[1] != num[2]) {
			bw.write(num[2] * 100 + "");
		}
		
		bw.flush();
		bw.close();
	}

}
