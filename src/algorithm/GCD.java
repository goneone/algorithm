package algorithm;

public class GCD {
	public static void main(String[] args) {
		int g = 1;
		int a = 24;
		int b = 18;
		
		System.out.println("test");
		for (int i = 2; i <= min(a,b); i++) {
			if((a % i == 0) && (b % i == 0)) {
				g = i;
			}
		}
		System.out.println(g);
	}
	
	public static int min(int a, int b) {
		if(a > b) {
			return b;
		} else if (a == b){
			return a;
		} else {
			return a;
		}
	}
}

