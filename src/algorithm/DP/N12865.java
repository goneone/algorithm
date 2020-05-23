package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.max;

public class N12865 {
    public static void main(String[] args) throws IOException {
        //무게 W
        //가치 V
        //물건들의 가치의 최댓값 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N =  Integer.parseInt(s[0]); //물품의 수
        int K =  Integer.parseInt(s[1]);//준서가 버틸수 있는 무게

        int[] W =new int[N+1]; //물건의 무게 배열
        int[] V =new int[N+1]; //물건의 가치 배열

        for (int i = 1; i <= N; i++) {
            String[] ss = br.readLine().split(" ");
            W[i] = Integer.parseInt(ss[0]);
            V[i] = Integer.parseInt(ss[1]);
        }
        int[][] dp = new int[N+1][K+1]; //DP = K무게 까지 넣을수 있는 배낭에 N개의 물건을 넣을 때 가치합의 최댓값

        //dp 0으로 초기화
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < K+1; j++) {
                    dp[i][j] = 0;
            }
        }

        for (int i = 1; i <= N; i++) { //i=개수 , j == 무게
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i-1][j];
                if(W[i] <= j) { //물품i의 무게보다 한계무게가 클때
                    dp[i][j] = max(dp[i-1][j], dp[i-1][j-W[i]] +V[i]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }

}

