package algorithm;

import java.util.Scanner;

public class N1929 {
	public static void main(String[] args) {

	//백준 1929번 
	//https://www.acmicpc.net/problem/1929
	//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		
		//1.두 수 받기.
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		//2.소수 구하기.
		int prime[] = new int[N];  
		int pn = 0; //소수의 개수
		boolean check[] = new boolean[N+1]; //false면 소수 true면 소수가 아님.
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