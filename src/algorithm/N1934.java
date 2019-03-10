package algorithm;

import java.util.Scanner;

public class N1934 {
	public static void main(String[] args) {
	//백준 1934번 
	//https://www.acmicpc.net/problem/2609
	//두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
	//두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in); 
		int testCount = scan.nextInt();
		
		// 문제풀이 -- 최대공약수 구해서, g * (a/g) * (b/g)
		for (int i = 0; i < testCount; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int g = gcd(A,B);
			int lcm = g * (A/g) * (B/g);
			System.out.println(lcm);
		}
	}
	
	public static int gcd(int a, int b) {
		while( b != 0) {
			int r = a % b ; 
			a = b;
			b = r;
		}
		return a;
	}
}
