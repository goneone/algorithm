package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class N2309 {
	public static void main(String[] args) {
	//�պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
	//��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
	//��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
		
		
		//9���� 2���� �̾�. -> �̴� ����� ��.
		//��ü���� �� 2����Ű�� ���µ�  100�϶�. ���.
		
		//9�� Ű �Է� �ޱ�.
		Scanner scan = new Scanner(System.in);
		int n = 9;
		int[] height = new int[n];
		int sum = 0; //��ü Ű���� ��
 		for (int i = 0; i < n; i++) {
			height[i] = scan.nextInt();
			sum += height[i];
		}
 		Arrays.sort(height);
 		
 		for (int i = 0; i < n; i++) {
 			for (int j =i+1; j < n; j++) {
				if(sum - height[i] - height[j] == 100) {
					//���
					for (int j2 = 0; j2 < n; j2++) {
						if(i ==j2 || j == j2)  continue; 
						System.out.println(height[j2]);
					}
				}
			}
		}
	}
}
