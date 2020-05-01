package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//계단의 개수
        int[] Point = new int[N+1]; //계단의 점수 배열

        for (int i = 0; i < N ; i++) {
            Point[i] = Integer.parseInt(br.readLine());
        }

        int[][] dp = new int[N+1][2];
        //계단의 규칙
        //1.한번에 1개나 2개 오를 수 있음.
        //2.연속된 3개는 밟으면 안됨
        //3.마지막 계단은 무조건 밟기

        //Point -> 계단 점수를 저장해 놓는 배열
        //dp[N][0] = 한 칸 전에서 온 점수를 더한 최대값
        //dp[N][1] = 두 칸 전에서 온 점수를 더한 최대값

        //순환식
        dp[0][0] = Point[0]; //첫번째 값
        dp[1][0] = Point[0] + Point[1]; //두번쨰값
        dp[1][1] = Point[1];

        for (int i = 2; i < N ; i++) {
            dp[i][0] = dp[i-1][1] + Point[i];
            dp[i][1] = Math.max(dp[i-2][0],dp[i-2][1]) + Point[i];
        }

        System.out.println(Math.max(dp[N-1][0],dp[N-1][1]));

    }
}
