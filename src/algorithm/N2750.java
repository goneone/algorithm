package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2750 {
	
		//https://www.acmicpc.net/problem/2750
		//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오
	public static void main(String[] args) throws IOException {
	    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		int [] arr = new int[n]; // 입력 받은 수 넣을 배열 
		
		for(int i = 0 ; i < n ; i ++)
		{
			arr[i]=Integer.parseInt(br.readLine());		//입력 받은 수 배열에 저장
		}
		
		
		//퀵정렬
		quickSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}		

	//버블정렬로 푼거
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

	//1번째 풀이
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
			System.out.println("l값은 : "+ l + "r값은 : " + r);
			
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




	//자고 일어나서 2번째 풀이
	//6 4 2 8 1 9 10 5 7 3
	//6 4 2 3 1 9 10 5 7 8
	//6 4 2 3 1 5 10 9 7 8
	//5 4 2 3 1 6 10 9 7 8
	//
	//1.오른쪽으로가면서 6보다 큰 수를 찾는다
	//2.왼쪽으로 가면서 6보다 작은 수 를 찾는다
	//3.수를 찾으면 두 수를 바꿔준다.
	//4.반복. 언제까지? 오른쪽 수의 번째가 왼쪽수의 번째보다 앞으로오면. 왼쪽수와 pivot값을 바꿔준다.
	//5. 두수가 엇갈리면 끝 내고 QUICKSORT 재귀호출
	public static void quickSort2(int[] data, int start, int end) {
		if(start >= end ) {
			return;
		}

		int temp;
		int pivot = start;
		int i = start + 1;
		int j = end;
		int arr[] = data;

		while(i <= j) { //엇갈릴 때 까지 반복하겠다

			while(arr[i] < arr[pivot] && i <= end) {
				i++;
			}

			while(arr[j] > arr[pivot] && j >= start) {
				j--;
			}

			if(i > j) { //엇갈린다면 arr[j]값이랑 arr[pivot] 값을 바꿔줌.
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			} else { //엇갈리는게 아니면 arr[i]랑 arr[j] 값 바꿔줌
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			quickSort2(arr, start, j-1);
			quickSort2(arr, j+1, end);
		}



	}
}
