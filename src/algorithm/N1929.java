package algorithm;

import java.util.Scanner;

public class N1929 {
	public static void main(String[] args) {

	//���� 1929�� 
	//https://www.acmicpc.net/problem/1929
	//M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		//1.�� �� �ޱ�.
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		//2.�Ҽ� ���ϱ�.
		int prime[] = new int[N];  
		int pn = 0; //�Ҽ��� ����
		boolean check[] = new boolean[N+1]; //false�� �Ҽ� true�� �Ҽ��� �ƴ�.
		for (int i = 2; i <= N; i++) {
			if(check[i] == false)  {
				prime[pn++] = i;
				for (int j = i*i; j <= N; j+=i) {
					check[j] = true;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if(M < prime[i]) {
				System.out.println(prime[i]);
			}
		}
		scan.close();
	}
}	