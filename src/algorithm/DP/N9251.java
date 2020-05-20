package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        //DP는 뭘로할것인가? 부분 수열이 되는 수열중 가장 긴 수열
        int[] dp = new int[A.length()];

        //DP초기화
        for (int i = 0; i < dp.length ; i++) {
            dp[i] = 0;
        }

        int m = 0; //자릿수
        for (int k = 0; k < A.length(); k++) {
            for (int i = 0; i < A.length(); i++) {
                for (int j = m; j < B.length(); j++) {
                    if(A.charAt(i) == B.charAt(j)) {
                        dp[k] ++;
                        m = j ;
                        break;
                    }
                }
            }
        }


        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}