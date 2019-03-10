package algorithm;

import java.util.Scanner;

public class N2609 {
	//���� 2609�� 
	//https://www.acmicpc.net/problem/2609
	//�� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int a = scan.nextInt(); 
		int b = scan.nextInt();
		int g = gcd(a, b);
		int l = lcm(a, b, g);
		
		System.out.println(g);
		System.out.println(l);
	}
	
	//��Ŭ���� ȣ�������� ǰ. ��Ŭ���� ȣ���� = a % b == r�ϋ� GCD(a,b) = GCD(b,r)
	public static int gcd(int a, int b) {
		
		while (b != 0) {
			
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
		
	}
	
	public static int lcm(int a, int b ,int g) {
		// l = g * (a/g) * (b/g) �ּҰ���� ���ϴ� ����
		int result = 0;
		result = g * (a/g) * (b/g);
		
		return result;
	}
}
