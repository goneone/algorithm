package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] A = new String[N];
        A = br.readLine().split(" ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(A[i]);
        }
        //1 2 3 5 1

        // dp = 해당 수에 들어갈 수있는 바이토닉 수열이면서 가장긴 수열의 수
        int[] dp = new int[N];

        dp[0] = 1;

        for (int i = 1; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                } 
            }
        }

        for (int i = 0; i < ; i++) {
            
        }

    }


}
