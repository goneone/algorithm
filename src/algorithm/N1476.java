package algorithm;

import java.util.Scanner;

public class N1476 {
	public static void main(String[] args) {
	//น้มุ 1476น๘ 
	//https://www.acmicpc.net/problem/1476
		Scanner scan = new Scanner(System.in);
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();
		int e =1 , s= 1, m = 1;
		
		for (int i = 1;; i++) {
			if(E == e && S == s && M == m) {
				System.out.println(i); 
				break;
			}
			
			e++;
			s++;
			m++;
			
			if( e == 16 ) e = 1;
			if( s == 29 ) s = 1;
			if( m == 20 ) m = 1;
					
		}
	}
}
