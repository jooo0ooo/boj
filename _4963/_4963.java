package _4963;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4963 {

	public static int width, height;
	public static int[][] data;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			if (width == 0 && height == 0) {
				break;
			}
			data = new int[height][width];
			
			for (int i = 0; i < height; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < width; j++) {
					data[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (data[i][j] != 0) {
						dfs (i, j);
						count++;
					}
				}
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int h, int w) {
		
		data[h][w] = 0;
		if (w + 1 < width && data[h][w+1] == 1) {
			dfs(h, w+1);
		}
		
		if (h + 1 < height && data[h+1][w] == 1) {
			dfs(h+1, w);
		}
		
		if (w > 0 && data[h][w-1] == 1) {
			dfs(h, w-1);
		}
		
		if (h > 0 && data[h-1][w] == 1) {
			dfs(h-1, w);
		}
		
		if (w + 1 < width && h + 1 < height && data[h+1][w+1] == 1) {
			dfs(h+1, w+1);
		}
		
		if (w + 1 < width && h > 0 && data[h-1][w+1] == 1) {
			dfs(h-1, w+1);
		}
		
		if (w > 0 && h > 0 && data[h-1][w-1] == 1) {
			dfs(h-1, w-1);
		}
		
		if (w > 0 && h + 1 < height && data[h+1][w-1] == 1) {
			dfs(h+1, w-1);
		}
		
	}
}