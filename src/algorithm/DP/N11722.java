package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        //가장 긴 감소하는 부분 수열.
        //DP[]는 가장 긴 감소하는 부분의 수열 길이
        for (int i = 0; i < N ; i++) {
            dp[i] = 1; //1을 초기화해둠
            for (int j = 0; j < i; j++) {

            }

        }

    }
}
