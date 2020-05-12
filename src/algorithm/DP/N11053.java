package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class N11053 {
    //////////////////////푸는중
    public static void main(String[] args) throws IOException {
        //가장 긴 증가하는 부분 수열의 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new[N];
        int[] DP = new[N]; //DP = 해당 수에 들어갈 수있는 가장 긴 증가하는 부분 수열의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            DP[i] = 1;
            for(int j= 0; j < i; j++) {
                if(A[j] < A[i] && DP[i] <= DP[j]) {
                    DP[i] = DP[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if(DP[i] > max) {
                max = DP[i];
            }
        }
        System.out.println(max);
    }
}