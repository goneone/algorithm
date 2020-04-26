package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N10845 {
	// 정수를 저장하는 큐를 구현한 다음,
	// 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String text = null;
		Queue queue = new Queue(n);
		for (int i = 0; i < n; i++) {
			text = br.readLine();
			String[] temp = text.split(" ");
			if (temp[0].equals("push")) {
				queue.push(Integer.parseInt(temp[1]));
			} else if (temp[0].equals("pop")) {
				System.out.println(queue.pop());
			} else if (temp[0].equals("size")) {
				System.out.println(queue.size());
			} else if (temp[0].equals("empty")) {
				System.out.println(queue.empty());
			} else if (temp[0].equals("front")) {
				System.out.println(queue.front());
			} else if (temp[0].equals("back")) {
				System.out.println(queue.back());
			}
		}
		br.close();
	}
}

class Queue {

	private int[] que;
	private int head, tail, temp;

	// 큐 배열 생성
	public Queue(int n) {
		que = new int[n];
	}

    public Queue() {

    }

    // 큐배열의 인덱스를 늘리면서 값 추가
	public void push(int value) {
		que[tail] = value;
		tail ++;
	}

	public int pop() {
		if(tail == head) {
			return -1;
		} else {
			head++;
			return que[head-1];
		}
	}

	// 사이즈는 rear크기만큼
	public int size() {
		return tail-head;
	}

	public int empty() {
		if (tail == head) {
			return 1;
		} else {
			return 0;
		}
	}

	public int front() {
		if (tail == head) {
			return -1;
		} else {
			return que[head];
		}
	}

	public int back() {
		if (tail == head) {
			return -1;
		} else {
			return que[tail-1];
		}
	}

}
