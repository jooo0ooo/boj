package _10866;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _10866 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String command;

		List<Integer> deque = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			command = s.nextLine();
			
			if(command.startsWith("push_front")) {
				
				pushFront(deque, Integer.parseInt(command.substring(11)));
				
			} else if(command.startsWith("push_back")) {
				
				pushBack(deque, Integer.parseInt(command.substring(10)));
				
			} else if("pop_front".equals(command)) {
				
				popFront(deque);
				
			} else if("pop_back".equals(command)) {
				
				popBack(deque);
				
			} else if("size".equals(command)) {
				
				size(deque);
				
			} else if("empty".equals(command)) {
				
				empty(deque);
				
			} else if("front".equals(command)) {
				
				front(deque);
				
			} else if("back".equals(command)) {
				
				back(deque);
				
			}
		}
		
		s.close();
		
	}
	
	/*
	 * push_front X: ���� X�� ���� �տ� �ִ´�.
	 * */
	static void pushFront(List<Integer> deque, int data) {
		deque.add(0, data);
	}

	/*
	 * push_back X: ���� X�� ���� �ڿ� �ִ´�.
	 * */
	static void pushBack(List<Integer> deque, int data) {
		deque.add(data);
	}
	
	/*
	 * pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * */
	static void popFront(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(0));
			deque.remove(0);
		}
	}

	/*
	 * pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * */
	static void popBack(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(deque.size() - 1));
			deque.remove(deque.size() - 1);
		}
	}
	
	/*
	 * size: ���� ����ִ� ������ ������ ����Ѵ�.
	 * */
	static void size(List<Integer> deque) {
		System.out.println(deque.size());
	}
	
	/*
	 * empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
	 * */
	static void empty(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	/*
	 * front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * */
	static void front(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(0));
		}
	}
	
	/*
	 * back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	 * */
	static void back(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(deque.size() - 1));
		}
	}

}
