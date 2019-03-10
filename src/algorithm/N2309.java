package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class N2309 {
	public static void main(String[] args) {
	//왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
	//아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
	//아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
		
		
		//9명중 2명을 뽑아. -> 뽑는 경우의 수.
		//전체에서 그 2명의키를 뺐는데  100일때. 출력.
		
		//9명 키 입력 받기.
		Scanner scan = new Scanner(System.in);
		int n = 9;
		int[] height = new int[n];
		int sum = 0; //전체 키값의 합
 		for (int i = 0; i < n; i++) {
			height[i] = scan.nextInt();
			sum += height[i];
		}
 		Arrays.sort(height);
 		
 		for (int i = 0; i < n; i++) {
 			for (int j =i+1; j < n; j++) {
				if(sum - height[i] - height[j] == 100) {
					//출력
					for (int j2 = 0; j2 < n; j2++) {
						if(i ==j2 || j == j2)  continue; 
						System.out.println(height[j2]);
					}
				}
			}
		}
	}
}
