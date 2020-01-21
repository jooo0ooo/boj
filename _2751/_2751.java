package _2751;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2751 {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < size; i++) {
			num.add(i, s.nextInt());
		}
		
		Collections.sort(num);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int n : num) {
			bw.write(n + "\n");
		}
		
		bw.close();
		s.close();
	}

}

/*
 * Through trial and error...
 * 
 * 첫번째 시도
 * int num[] ... Arrays.sort(num) ... System.out.println(n)
 * 에러 유형 : 시간 초과
 * 이유 : Java에서 Arrays.sort에 primitive type array를 전달하면 dual-pivot quicksort를 수행하기 때문에 최악의 경우 O(N^2)이 됩니다. 
 * 		  이는 보통의 방법으로는 웬만해서는 O(N^2)이 안 되지만 이 문제에는 https://www.acmicpc.net/board/view/34491 에 의해 추가된 저격 데이터가 있습니다. 
 * 		  Collections.sort를 사용하는 편이 좋습니다.
 * 이유 파악 출처 : https://www.acmicpc.net/board/view/31887
 * 
 * 두번째 시도
 * List<Integer> num = new ArrayList<>() ... Collections.sort(num); ... System.out.println(n);
 * 에러 유형 : 시간 초과
 * 이유 : 출력 속도? 때문으로 판단
 * 이유 파악 출처 : https://www.acmicpc.net/blog/view/57
 * 
 * 세번째 시도
 * List<Integer> num = new ArrayList<>() ... Collections.sort(num) ... bw.write(n + "\n")
 * 정답^^
 * 
 * */
