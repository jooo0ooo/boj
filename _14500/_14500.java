package _14500;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _14500 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		// 막대기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j + 3 < m; j++) {
				max = Math.max(max, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3]);
			}
		}
		
		// 누은 막대기
		for (int i = 0; i + 3 < n; i++) {
			for (int j = 0; j < m; j++) {
				max = Math.max(max, arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j]);
			}
		}
		
		//정사각
		for (int i = 0; i + 1 < n; i++) {
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max, arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1]);
			}
		}
		
		for (int i = 0; i + 1 < n; i++) {
			//옆으로 긴 역ㄴ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2]);
			}
			
			// 옆으로 긴 역ㄱ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j]);
			}
			
			// 옆으로 긴 역ㄴ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+2]);
			}
			
			// 옆으로 긴 ㄱ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2]);
			}
			
		}
		
		for (int i = 0; i + 2 < n; i++) {
			// 아래로 긴 역ㄱ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j]);
			}
			
			// 아래로 긴 ㄱ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1]);
			}
			
			// 아래로 긴ㄴ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1]);
			}
			
			// 아래로 긴 역ㄴ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j]);
			}
		}
		
		for (int i = 0; i + 2 < n; i++) {
			// 왼쪽 위 시작 번개
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1]);
			}
			
			// 오른쪽 위 시작 번개
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j] + arr[i+2][j]);
			}
		}
		
		for (int i = 0; i + 1 < n; i++) {
			// 왼 아래 시작 누은 번개
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i+1][j] + arr[i+1][j+1] + arr[i][j+1] + arr[i][j+2]);
			}
			
			// 왼 위 시작 누은 번개
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2]);
			}
		}
		
		for (int i = 0; i + 1 < n; i++) {
			// 아래 ㅗ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]);
			}
			
			// 위 ㅗ
			for (int j = 0; j + 2 < m; j++) {
				max = Math.max(max ,arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+1]);
			}
		}
		
		for (int i = 0; i + 2 < n; i++) {
			// 우 ㅗ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1]);
			}
			
			// 좌 ㅗ
			for (int j = 0; j + 1 < m; j++) {
				max = Math.max(max ,arr[i+1][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1]);
			}
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}