package algorithm;

import java.util.Iterator;

public class sort {

	public static void main(String[] args) {
		int number = 10;
		int[] data = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

		
		sort sort = new sort();
		//sort.quickSort(data, 0, number - 1);
		sort.selectSort(data);
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
			for (int j = i; j < data.length; j++) { //�������� ���� ã�°�.
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
		// 1, 10, 5, 8, 7, 6, 4, 3, 2, 9, 11 , 12 ,13, 14, 15
		// 1, 5, 8, 7, 6, 4, 3, 2, 9, 10  
		// 
		for (int i = 0; i < data.length; i++) {
			if(data[i] > data[i+1]) {
				temp = data[i+1];
				data[i+1] = data[i];
				data[i] = temp;
			}
		}
	}

	// ��������
	public void insertSort() {
		// �� ���ڸ� ������ ��ġ�� �����ϸ� ���?

	}
	
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
			
			while(i <= end && data[i] < data[key]) { //Ű������ ū �� ���������� �̵�.
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
			quickSort(data, j + 1, end); 
		}
	}
	
}
