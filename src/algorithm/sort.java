package algorithm;

public class sort {

	public static void main(String[] args) {
		int number = 15;
		int[] data = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9, 11 , 12 ,13, 14, 15  };

		sort sort = new sort();
		sort.quickSort(data, 0, number - 1);
		for (int i = 0; i < number; i++) {
			System.out.print(data[i] + "  ");
		}
	}

	// 선택정렬
	public void selectSort() {
		// 가장 작은 것을 앞으로 보내면 어떨까?
	}

	// 버블정렬
	public void bubbleSort() {
		// 두개 비교해서 작은것을 왼쪽으로 보내면 어떨까?
	}

	// 삽입정렬
	public void insertSort() {
		// 각 숫자를 적절한 위치에 삽입하면 어떨까?

	}
	
	public void quickSort(int[] data, int start, int end) {
		//특정한 값을 기준으로 큰 숫자와 작은 숫자를 나누면 어떨까?(두 집합으로)
		
		if(start >= end) { //원소가 1개인 경우 
			return; 
		}
	  
		int key = start; //pivot값 
		int i = start + 1; //왼쪽에서 시작 값
		int j = end ; //오른쪽에서 시작 값 
		int temp; //swap 할 때 담을 변수 
		
		//4, 7, 5, 8, 10, 6, 1, 3, 2, 9
		//1, 2, 3, 4, 10, 6, 8, 5, 7, 9
		while(i <= j) { //엇갈릴때 까지 반복. 
			
			while(i <= end && data[i] < data[key]) { //키값보다 큰 값 만날때까지 이동.
				i++; 
			} 
			
			while(j >= start && data[j] > data[key] ) { //오른쪽에서부터 키 값보다 작은 값 만날 때 까지 이동
				j--; 
			}
	  
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
			quickSort(data, j + 1, end); 
		}
	}
}
