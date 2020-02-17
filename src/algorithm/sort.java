package algorithm;

import java.util.Iterator;

public class sort {

	public static void main(String[] args) {
		int number = 9;
		//int[] data = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		int[] data = { 7, 6, 5, 8, 3, 5 ,9 , 1, 6  };
		
		sort sort = new sort();
		sort.quickSort(data, 0, number - 1);
		//sort.selectSort(data);
		//sort.insertSort(data);
		//sort.bubbleSort(data);
		//sort.countingSort();
		//sort.heapSort(data);
		for (int i = 0; i < number; i++) {
			System.out.print(data[i] + "  ");
		}
	}

	// 선택정렬
	public void selectSort(int[] data) {
		// 가장 작은 것을 앞으로 보내면 어떨까?
		int min = 0;
		int index = 0;
		int temp;
		
		//1, 10, 5, 8, 7, 6, 4, 3, 2, 9
		for (int i = 0; i < data.length; i++) {
			min = 999;
			for (int j = i; j < data.length; j++) { //가장 작은 값을 찾는거.
				if(min > data[j]) {
					min = data[j];
					index = j;
				}
			}
			temp = data[i];
			data[i] = data[index];
			data[index]	= temp;
		}
	}

	// 버블정렬
	public void bubbleSort(int[] data) {
		// 두개 비교해서 작은것을 왼쪽으로 보내면 어떨까?
		int temp;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if(data[j] > data[j+1]) {
					temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	// 삽입정렬
	public void insertSort(int data[]) {
		//각 숫자를 적절한 위치에 삽입하면 어떨까?
		//1, 10, 5, 8, 7, 6, 4, 3, 2, 9
		//1, 5, 8, 7, 10
		int temp;
		int j;
		for (int i = 0; i < data.length -1 ; i++) {
			j = i;
			while(j>=0 && data[j] > data[j+1]) {
				temp = data[j];
				data[j] = data[j+1];
				data[j+1] = temp;
				j--;
			}
		}
	}
	public void insertSort2(int data[]) {
		int temp;
		int j; 
		for (int i = 0; i < data.length-1; i++) {
			j = i;
			while(j>=0 && data[j] > data[j+1]) {
				
			}
			
		}
	}
	//퀵정렬
	public void quickSort(int[] data, int start, int end) {
		//특정한 값을 기준으로 큰 숫자와 작은 숫자를 나누면 어떨까?(두 집합으로)
		
		if(start >= end) { //원소가 1개인 경우 
			return; 
		}
	  
		int key = start; //pivot값 
		int i = start + 1; //왼쪽에서 시작 값
		int j = end ; //오른쪽에서 시작 값 
		int temp; //swap 할 때 담을 변수 
		
		while(i <= j) { //엇갈릴때 까지 반복. 
			System.out.println("l값은 : "+ i + "r값은 : " + j);
			while(i <= end && data[i] <= data[key]) { //키값보다 큰 값 만날때까지 이동.
				i++; 
			} 
			
			while(j >= start && data[j] > data[key] ) { //오른쪽에서부터 키 값보다 작은 값 만날 때 까지 이동
				j--; 
			}
			// 3, 4, 5, 1, 6, 2, 10 , 9 ,8, 7
			// 3, 2, 1, 4, 6, 5, 10 , 9 ,8, 7
			if(i > j) { //엇갈렸따면 왼쪽 값과 키값을 바꿔줌. 
				temp = data[j]; 
				data[j] = data[key];
				data[key] = temp; 
			} else { //엇갈리지 않는다면 큰값과 작은 값을 바꿔줌. 
				temp = data[i]; 
				data[i]= data[j]; 
				data[j] = temp; 
			}
	  
			quickSort(data, start, j - 1); 
			System.out.println("언제?");
			quickSort(data, j + 1, end); 
		}
	}
	
	//힙 정렬
	public void heapSort(int[] data) {
		// 7, 6, 5, 8, 3, 5 ,9 , 1, 6 
		int number = data.length;
		int[] heap = data;
		
		//힙을 구성
		for (int i = 1; i < number; i++) {
			int c = i;
			do {
				int root = (c - 1)/ 2; //상위 노드
				System.out.println("root :" + root + ", i : "+ i );
				if(heap[root] < heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c= root;
			} while ( c != 0);
		}
		//크기를 줄여가며 반복적으로 힙을 구성
		for (int i = number - 1; i >=0; i--) { //마지막이랑 첫번째꺼 교환
			int temp = 	heap[0];
			heap[0]  = 	heap[i];
			heap[i]  = 	temp;
			int root =  0;
			int c	 =	1;
			
			do {
				c = 2 * root + 1;
				
				//자식 중에 더 큰 값을 찾기
				if(c < i-1 && heap[c]<heap[c+1]) { // 왼쪽 자식노드보다 오른쪽 자식노드가 클 경우 그리고 자식노드의 다음 자식노드와 비교할 때 인덱스 오류를 벗어나기 위해 c<i-1
					c++; // c이동
			    }
				
				//루트보다 자식이 크다면 교환
				if(c<i && heap[root] < heap[c] ) { // 두 자식노드 중 큰 자식노드와 부모노드 비교 후 크다면 교환 그리고 자식노드가 전체 노드의 수를 벗어나지 않기 위해 c<i
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;     
				}
				root = c;
			} while ( c < i);
		} 
	}
	
	//계수 정렬
	public void countingSort() {
		//언제쓸까? 
		//데이터가 1이 5개 2가 4개 3이 ... 5가 5개 이런식으로 중복되는 데이터가 여러개 나오면서 정렬할 경우
		
		int[] array = {
				1, 3, 2, 4, 3, 2, 5, 3, 1, 2 ,
				3, 4, 4, 3, 5, 1, 2, 3, 5, 2 ,
				3, 1, 4, 3, 5, 1, 2, 1, 1, 1
		};
		int[] count = new int[5] ;
		
		//count 값에  0 , 0 , 0 , 0 , 0  넣기
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		};
		
		for (int i = 0; i < array.length; i++) {	  
			count[array[i] - 1 ] ++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				for (int j = 0; j < count[i]; j++) {
					System.out.print(i +1 + " ");
				}
			}
		}
	}
	
}
