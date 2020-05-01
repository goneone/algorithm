package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //dp[i] = 길이가 i일 때 만들 수 있는 경우의 수
        //dp[i] = dp[i-1]*1 + dp[i-2]*1;
        //테스트를 할때 최솟값, 최댓값을 다 넣어봐야한다***
        int[] dp = new int[N+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length ; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%15746;
        }

        System.out.println(dp[N]);
    }

}
