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
}
