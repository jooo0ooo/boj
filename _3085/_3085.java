package _3085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _3085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int max = 1, count = 1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if (j + 1 != n) {
					char temp = board[i][j];
					board[i][j] = board[i][j+1];
					board[i][j+1] = temp;
					
					
					for (int k = j; k < n-1; k++) {
						if (board[i][j] == board[i][k+1]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = j; k > 0; k--) {
						if (board[i][j] == board[i][k-1]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					for (int k = i; k < n-1; k++) {
						if (board[i][j] == board[k+1][j]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = i; k > 0; k--) {
						if (board[i][j] == board[k-1][j]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					for (int k = i; k < n-1; k++) {
						if (board[i][j+1] == board[k+1][j+1]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = i; k > 0; k--) {
						if (board[i][j+1] == board[k-1][j+1]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					temp = board[i][j];
					board[i][j] = board[i][j+1];
					board[i][j+1] = temp;
					
				}
			}
			
			for (int j = 0; j < n; j++) {
				if (j + 1 != n) {
					char temp = board[j][i];
					board[j][i] = board[j+1][i];
					board[j+1][i] = temp;
					
					for (int k = j; k < n-1; k++) {
						if (board[j][i] == board[k+1][i]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = j; k > 0; k--) {
						if (board[j][i] == board[k-1][i]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					for (int k = i; k < n-1; k++) {
						if (board[j][i] == board[j][k+1]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = i; k > 0; k--) {
						if (board[j][i] == board[j][k-1]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					for (int k = i; k < n-1; k++) {
						if (board[j+1][i] == board[j+1][k+1]) {
							count++;
						} else {
							break;
						}
					}
					
					for (int k = i; k > 0; k--) {
						if (board[j+1][i] == board[j+1][k-1]) {
							count++;
						} else {
							break;
						}
					}
					max = Math.max(max, count);
					count = 1;
					
					temp = board[j][i];
					board[j][i] = board[j+1][i];
					board[j+1][i] = temp;
				}
			}
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
	}

}