package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int[] arr = new int[index];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		quickSort(arr, 0, arr.length-1);
		
		for (int i : arr) {
			System.out.print(" " + i );
		}
	}
	
	static void quickSort(int[] arr, int start, int end ) {
		int pivot = start;
		int l = start + 1;    
		int r =	end;	
		int temp;
				
		while( l <= r) {
			//4, 1 ,3 , 5, 2, 6
			//1.l은 ++ r은 --
			while(l <=end && arr[l] <= arr[pivot] ) {
				l++;
			}
			
			while(r >= start && arr[r] > arr[pivot]) {
				r--;
			}
			
			if(l > r ) { //뒤바뀌게 되면 r과 pivot 을 교환
				temp = arr[r];
				arr[r] = arr[pivot];
				arr[pivot] = temp;
			} else { //그게아니면 l과 r을 교환
				temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
			
			quickSort(arr, start, r - 1);
			quickSort(arr, r+1, end);
		}
	}
	
}
