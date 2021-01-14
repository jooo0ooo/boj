package _11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11723 {

	public static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[21];
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String feature = st.nextToken();
			int x = 0;
			if (!"all".equals(feature) && !"empty".equals(feature)) {
				x = Integer.parseInt(st.nextToken());
			}
			switch (feature) {
				case "add":
					add(arr, x);
					break;
				case "remove":
					remove(arr, x);
					break;
				case "check":
					check(arr, x);
					break;
				case "toggle":
					toggle(arr, x);
					break;
				case "all":
					all(arr);
					break;
				case "empty":
					empty(arr);
					break;
			}
		}
		bw.flush();
		bw.close();
		
	}
	
	public static void add(int[] arr, int x) {
		if (arr[x] == 0) {
			arr[x] = 1;
		}
	}
	
	public static void remove(int[] arr, int x) {
		if (arr[x] == 1) {
			arr[x] = 0;
		}
	}
	
	public static void check(int[] arr, int x) throws IOException {
		if (arr[x] == 1) {
			bw.write("1\n");
		} else {
			bw.write("0\n");
		}
	}
	
	public static void toggle(int[] arr, int x) {
		if (arr[x] == 0) {
			arr[x] = 1;
		} else {
			arr[x] = 0;
		}
	}
	
	public static void all(int[] arr) {
		for (int i = 1; i <= 20; i++) {
			arr[i] = 1;
		}
	}
	
	public static void empty(int[] arr) {
		for (int i = 1; i <= 20; i++) {
			arr[i] = 0;
		}
	}

}
