package _1759;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1759 {

	public static int l, c;
	public static int[] arr;
	public static String[] print;
	public static boolean[] visited;
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new int[c + 1];
		print = new String[c + 1];
		visited = new boolean[c + 1];
		
		st = new StringTokenizer(br.readLine());
		print[0] = "a";
		for (int i = 1; i <= c; i++) {
			print[i] = st.nextToken();
		}
		Arrays.sort(print);
		
		dfs(1, 1);
		
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int depth, int count) throws IOException{
		if (depth == l + 1) {
			int consonant = 0, vowel = 0;
			boolean flag = false;
			for (int i = 1; i <= l && !flag; i++) {
				if (print[arr[i]].equals("a") || print[arr[i]].equals("e") || print[arr[i]].equals("i") || print[arr[i]].equals("o") || print[arr[i]].equals("u")) {
					vowel++;
				} else {
					consonant++;
				}
				
				if (consonant >= 2 && vowel >= 1) {
					flag = true;
				}
			}
			
			if (flag) {
				for (int i = 1; i<= l; i++) {
					bw.write(print[arr[i]] + "");
				}
				bw.newLine();
			}
			
		}
		
		for (int i = 1; i <= c; i++) {
			if (!visited[i] && count <= i) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}
}