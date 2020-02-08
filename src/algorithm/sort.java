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

	// ��������
	public void selectSort() {
		// ���� ���� ���� ������ ������ ���?
	}

	// ��������
	public void bubbleSort() {
		// �ΰ� ���ؼ� �������� �������� ������ ���?
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
