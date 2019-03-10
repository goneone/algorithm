package algorithm;

import java.util.Scanner;

public class N2609 {
	//백준 2609번 
	//https://www.acmicpc.net/problem/2609
	//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int a = scan.nextInt(); 
		int b = scan.nextInt();
		int g = gcd(a, b);
		int l = lcm(a, b, g);
		
		System.out.println(g);
		System.out.println(l);
	}
	
	//유클리드 호제법으로 품. 유클리드 호제법 = a % b == r일떄 GCD(a,b) = GCD(b,r)
	public static int gcd(int a, int b) {
		
		while (b != 0) {
			
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
		
	}
	
	public static int lcm(int a, int b ,int g) {
		// l = g * (a/g) * (b/g) 최소공배수 구하는 공식
		int result = 0;
		result = g * (a/g) * (b/g);
		
		return result;
	}
}
