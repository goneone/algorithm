package algorithm;

import java.util.Scanner;

public class array {
	public static int count = 0;
	public static int[] dat = new int[100000];
	
	public static void main(String[] args) {
		array array = new array();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String text = sc.next(); //¸í·É¾î
			if(text.contains("push")) {
				int input2 = Integer.parseInt(text.split(" ")[1]);
				dat[i] = input2;
			}
			else if(text.equals("pop")) {
				System.out.println(array.pop());
			}
			else if(text.equals("size")) {
				System.out.println(array.size());
			}
			else if(text.equals("empty")) {
				System.out.println(array.empty());
			}
			else if(text.equals("top")) {
				System.out.println(array.top());
			}
		}
	}
	//https://blog.encrypted.gg/725?category=773649
	
	//stack
	public void push(int val) {
		dat[count] = val;
		count ++;
	}
	
	public int pop() {
		if(count == 0) {
			return -1;
		} else {
			count --;
			return dat[count-1];
		}
	}
	public int size() {
		return count;
	}
	
	public int empty() {
		if(dat.length == 0 ) {
			return 1 ;
		} else {
			return 0;
		}
	}
	
	public int top() {
		if(count == 0) {
			return -1;
		}
		
		return dat[count-1];
	}
}
