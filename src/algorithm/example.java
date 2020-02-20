package algorithm;

public class example {
	//https://blog.encrypted.gg/922?category=773649
	public static void main(String[] args) {
		
	}
	
	public static int func1(int N) {
		int ret = 0;
		for (int i = 1; i < N; i++) {
			if(i%3 == 0 || i%5 == 0) {
				ret += i;
			}
		}
		return ret;
	}
	
	public static int func2(int arr[], int N) {
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if(arr[i] + arr[j] == 100 ) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static int func3(int N) {
		for (int i = 1; i * i <= N; i++) {
			if(i*i == N) {
				return 1;
			}
		}
		return 0;
	}
	
	public static int func4(int N) {
		int val = 1;
		while(2 * val <= N) {
			val *= 2;
		}
		return val;
	}	
}
