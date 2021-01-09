package _2869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
		
		int left = v - a;
		int power = a - b;
		
		int result = (left / power) + 1;
		if (left % power != 0) {
			result++;
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		
	}

}