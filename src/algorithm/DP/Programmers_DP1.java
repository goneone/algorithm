package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programmers_DP1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

    }

    public long solution(int N) {
        long answer = 0;

        //dp배열은 타일의 길이를 담은 배열 (피보나치)
        long[] dp = new long[N+1];

        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < N+1 ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        answer = dp[N] * 4 + dp[N-1] *2;
        return answer;

    }
}
