package algorithm;

import java.util.Scanner;

public class N1978 {
	public static void main(String[] args) {
	//백준 1978번 
	//https://www.acmicpc.net/problem/1978
	//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in); 
		int totalNumberCount = scan.nextInt();
		int primeCount = 0;
		
		for (int i = 0; i < totalNumberCount; i++) {
			int number = scan.nextInt();
			if(Prime(number) == true) {
				primeCount ++;
			} 
 		}
		System.out.println(primeCount);
	}
	
	public static boolean Prime(int n) {
		if ( n < 2) {
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
