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
	 * push_front X: 정수 X를 덱의 앞에 넣는다.
	 * */
	static void pushFront(List<Integer> deque, int data) {
		deque.add(0, data);
	}

	/*
	 * push_back X: 정수 X를 덱의 뒤에 넣는다.
	 * */
	static void pushBack(List<Integer> deque, int data) {
		deque.add(data);
	}
	
	/*
	 * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
	 * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
	 * size: 덱에 들어있는 정수의 개수를 출력한다.
	 * */
	static void size(List<Integer> deque) {
		System.out.println(deque.size());
	}
	
	/*
	 * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
	 * */
	static void empty(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	/*
	 * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * */
	static void front(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(0));
		}
	}
	
	/*
	 * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * */
	static void back(List<Integer> deque) {
		if(deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(deque.size() - 1));
		}
	}

}
