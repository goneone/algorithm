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

	// ��������
	public void selectSort(int[] data) {
		// ���� ���� ���� ������ ������ ���?
		int min = 0;
		int index = 0;
		int temp;
		
		//1, 10, 5, 8, 7, 6, 4, 3, 2, 9
		for (int i = 0; i < data.length; i++) {
			min = 999;
			for (int j = i; j < data.length; j++) { //���� ���� ���� ã�°�.
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

	// ��������
	public void bubbleSort(int[] data) {
		// �ΰ� ���ؼ� �������� �������� ������ ���?
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

	// ��������
	public void insertSort(int data[]) {
		//�� ���ڸ� ������ ��ġ�� �����ϸ� ���?
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
	//������
	public void quickSort(int[] data, int start, int end) {
		//Ư���� ���� �������� ū ���ڿ� ���� ���ڸ� ������ ���?(�� ��������)
		
		if(start >= end) { //���Ұ� 1���� ��� 
			return; 
		}
	  
		int key = start; //pivot�� 
		int i = start + 1; //���ʿ��� ���� ��
		int j = end ; //�����ʿ��� ���� �� 
		int temp; //swap �� �� ���� ���� 
		
		while(i <= j) { //�������� ���� �ݺ�. 
			System.out.println("l���� : "+ i + "r���� : " + j);
			while(i <= end && data[i] <= data[key]) { //Ű������ ū �� ���������� �̵�.
				i++; 
			} 
			
			while(j >= start && data[j] > data[key] ) { //�����ʿ������� Ű ������ ���� �� ���� �� ���� �̵�
				j--; 
			}
			// 3, 4, 5, 1, 6, 2, 10 , 9 ,8, 7
			// 3, 2, 1, 4, 6, 5, 10 , 9 ,8, 7
			if(i > j) { //�����ȵ��� ���� ���� Ű���� �ٲ���. 
				temp = data[j]; 
				data[j] = data[key];
				data[key] = temp; 
			} else { //�������� �ʴ´ٸ� ū���� ���� ���� �ٲ���. 
				temp = data[i]; 
				data[i]= data[j]; 
				data[j] = temp; 
			}
	  
			quickSort(data, start, j - 1); 
			System.out.println("����?");
			quickSort(data, j + 1, end); 
		}
	}
	
	//�� ����
	public void heapSort(int[] data) {
		// 7, 6, 5, 8, 3, 5 ,9 , 1, 6 
		int number = data.length;
		int[] heap = data;
		
		//���� ����
		for (int i = 1; i < number; i++) {
			int c = i;
			do {
				int root = (c - 1)/ 2; //���� ���
				System.out.println("root :" + root + ", i : "+ i );
				if(heap[root] < heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c= root;
			} while ( c != 0);
		}
		//ũ�⸦ �ٿ����� �ݺ������� ���� ����
		for (int i = number - 1; i >=0; i--) { //�������̶� ù��°�� ��ȯ
			int temp = 	heap[0];
			heap[0]  = 	heap[i];
			heap[i]  = 	temp;
			int root =  0;
			int c	 =	1;
			
			do {
				c = 2 * root + 1;
				
				//�ڽ� �߿� �� ū ���� ã��
				if(c < i-1 && heap[c]<heap[c+1]) { // ���� �ڽĳ�庸�� ������ �ڽĳ�尡 Ŭ ��� �׸��� �ڽĳ���� ���� �ڽĳ��� ���� �� �ε��� ������ ����� ���� c<i-1
					c++; // c�̵�
			    }
				
				//��Ʈ���� �ڽ��� ũ�ٸ� ��ȯ
				if(c<i && heap[root] < heap[c] ) { // �� �ڽĳ�� �� ū �ڽĳ��� �θ��� �� �� ũ�ٸ� ��ȯ �׸��� �ڽĳ�尡 ��ü ����� ���� ����� �ʱ� ���� c<i
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;     
				}
				root = c;
			} while ( c < i);
		} 
	}
	
	//��� ����
	public void countingSort() {
		//��������? 
		//�����Ͱ� 1�� 5�� 2�� 4�� 3�� ... 5�� 5�� �̷������� �ߺ��Ǵ� �����Ͱ� ������ �����鼭 ������ ���
		
		int[] array = {
				1, 3, 2, 4, 3, 2, 5, 3, 1, 2 ,
				3, 4, 4, 3, 5, 1, 2, 3, 5, 2 ,
				3, 1, 4, 3, 5, 1, 2, 1, 1, 1
		};
		int[] count = new int[5] ;
		
		//count ����  0 , 0 , 0 , 0 , 0  �ֱ�
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
