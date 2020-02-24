package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10828 {
	// https://www.acmicpc.net/problem/10828
	// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		Stack stack = new Stack();
		System.out.println("ABCDEFGG");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(stack.pop() + "\n");
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				sb.append(stack.empty() + "\n");
				break;
			case "top":
				sb.append(stack.top() + "\n");
				break;
			}
		}
		System.out.println(sb);
	}
}

class Stack {
	private Value top = null;
	private int size;

	public void push(int n) {
		Value value = new Value();
		value.n = n;
		value.next = top;
		top = value;
		size++;
	}

	public int top() {
		if (empty() == 1)
			return -1;
		else
			return top.n;
	}

	public int pop() {
		if (empty() == 1)
			return -1;
		int n = top.n;
		top = top.next;
		size--;
		return n;
	}

	public int size() {
		return size;
	}

	public int empty() {
		return size != 0 ? 0 : 1;
	}

	static class Value {
		private int n;
		private Value next;
	}

}
