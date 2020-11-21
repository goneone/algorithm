package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2750 {
	
		//https://www.acmicpc.net/problem/2750
		//N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�
	public static void main(String[] args) throws IOException {
	    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		int [] arr = new int[n]; // �Է� ���� �� ���� �迭 
		
		for(int i = 0 ; i < n ; i ++)
		{
			arr[i]=Integer.parseInt(br.readLine());		//�Է� ���� �� �迭�� ����
		}
		
		
		//������
		quickSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}		

	//�������ķ� Ǭ��
	/*public static void bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp 	 = 	arr[j];
					arr[j]   = 	arr[j+1];
					arr[j+1] = 	temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}*/

	//1��° Ǯ��
	public static void quickSort(int[] data, int start, int end) {
		
		if (start >= end ) {
			return;
		}
		
		int arr[] = data;
		
		int pivot = start;
		int l = start + 1;
		int r = end; 
		int temp;

		while(l <= r) {
			System.out.println("l���� : "+ l + "r���� : " + r);
			
			while(l <= end && arr[l] < arr[pivot] ) {
				l++;
			}
			
			while(r >= start && arr[r] > arr[pivot]) {
				r--;
			}
			
			if(l > r ) {
				temp = arr[r];
				arr[r] = arr[pivot];
				arr[pivot] = temp;
				
			} else {
				temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
			
			quickSort(arr, start , r-1);
			quickSort(arr, r+1 , end);
			
		}
	}




	//�ڰ� �Ͼ�� 2��° Ǯ��
	//6 4 2 8 1 9 10 5 7 3
	//6 4 2 3 1 9 10 5 7 8
	//6 4 2 3 1 5 10 9 7 8
	//5 4 2 3 1 6 10 9 7 8
	//
	//1.���������ΰ��鼭 6���� ū ���� ã�´�
	//2.�������� ���鼭 6���� ���� �� �� ã�´�
	//3.���� ã���� �� ���� �ٲ��ش�.
	//4.�ݺ�. ��������? ������ ���� ��°�� ���ʼ��� ��°���� �����ο���. ���ʼ��� pivot���� �ٲ��ش�.
	//5. �μ��� �������� �� ���� QUICKSORT ���ȣ��
	public static void quickSort2(int[] data, int start, int end) {
		if(start >= end ) {
			return;
		}

		int temp;
		int pivot = start;
		int i = start + 1;
		int j = end;
		int arr[] = data;

		while(i <= j) { //������ �� ���� �ݺ��ϰڴ�

			while(arr[i] < arr[pivot] && i <= end) {
				i++;
			}

			while(arr[j] > arr[pivot] && j >= start) {
				j--;
			}

			if(i > j) { //�������ٸ� arr[j]���̶� arr[pivot] ���� �ٲ���.
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			} else { //�������°� �ƴϸ� arr[i]�� arr[j] �� �ٲ���
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			quickSort2(arr, start, j-1);
			quickSort2(arr, j+1, end);
		}



	}
}
