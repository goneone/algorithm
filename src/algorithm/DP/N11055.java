package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] DP = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
               if(arr[i] > arr[j]) {
                   DP[i] = arr[i] + DP[j];
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
