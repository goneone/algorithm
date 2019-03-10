package algorithm;

import java.util.Scanner;

public class N1934 {
	public static void main(String[] args) {
	//���� 1934�� 
	//https://www.acmicpc.net/problem/2609
	//�� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.
	//�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scan = new Scanner(System.in); 
		int testCount = scan.nextInt();
		
		// ����Ǯ�� -- �ִ����� ���ؼ�, g * (a/g) * (b/g)
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
