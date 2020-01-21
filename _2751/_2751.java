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
 * ù��° �õ�
 * int num[] ... Arrays.sort(num) ... System.out.println(n)
 * ���� ���� : �ð� �ʰ�
 * ���� : Java���� Arrays.sort�� primitive type array�� �����ϸ� dual-pivot quicksort�� �����ϱ� ������ �־��� ��� O(N^2)�� �˴ϴ�. 
 * 		  �̴� ������ ������δ� �����ؼ��� O(N^2)�� �� ������ �� �������� https://www.acmicpc.net/board/view/34491 �� ���� �߰��� ���� �����Ͱ� �ֽ��ϴ�. 
 * 		  Collections.sort�� ����ϴ� ���� �����ϴ�.
 * ���� �ľ� ��ó : https://www.acmicpc.net/board/view/31887
 * 
 * �ι�° �õ�
 * List<Integer> num = new ArrayList<>() ... Collections.sort(num); ... System.out.println(n);
 * ���� ���� : �ð� �ʰ�
 * ���� : ��� �ӵ�? �������� �Ǵ�
 * ���� �ľ� ��ó : https://www.acmicpc.net/blog/view/57
 * 
 * ����° �õ�
 * List<Integer> num = new ArrayList<>() ... Collections.sort(num) ... bw.write(n + "\n")
 * ����^^
 * 
 * */
