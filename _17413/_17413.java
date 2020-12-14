package _17413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class _17413 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		ArrayList<String> wordList = new ArrayList<>();
		boolean flag = false; //0 -> 태그 입력 중
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == '<') {
				if (temp.length() > 0) {
					wordList.add(temp);
					temp = "";
				}
				temp += "<";
				flag = true;				
				continue;
			}
			
			if (input.charAt(i) == '>') {
				temp += ">";
				flag = false;
				wordList.add(temp);
				temp = "";
				continue;
			}
			
			if(flag) {
				temp += Character.toString(input.charAt(i));
				continue;
			}
			
			if (flag == false && input.charAt(i) == ' ') {
				wordList.add(temp);
				wordList.add(" ");
				temp = "";
				continue;
			}
			
			temp += Character.toString(input.charAt(i));
			
			if (i + 1 == input.length()) {
				wordList.add(temp);
			}
		}
		
		int wordListSize = wordList.size();
		for (int i = 0; i < wordListSize; i ++) {
			String word = wordList.get(i);
			if (!word.startsWith("<") && !word.startsWith(" ")) {
				String wordTemp = "";
				for (int j = 1; j <= word.length(); j++) {
					wordTemp += Character.toString(word.charAt(word.length() - j));
				}
				wordList.add(i, wordTemp);
				wordList.remove(i + 1);
			}
			bw.write(wordList.get(i));
			
		}
		
		bw.flush();
		bw.close();
		
	}
	
}