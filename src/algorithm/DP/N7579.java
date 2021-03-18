package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7579 {
    public static void main(String[] args) throws IOException {
        //N개의 앱
        //M배열 = M바이트 만큼의 메모리를 사용
        //C배열 = 다시 실행시 비용 배열
        //M바이트 확보하는 방법

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split("");
        int N = Integer.parseInt(s1[0]); //앱의 개수
        int M = Integer.parseInt(s1[0]); //확보해야할 메모리

        String[] s2 = br.readLine().split("");
        int[] A = new int[N]; //앱이 사용중인 메모리의 바이트 수
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(s2[i]);
        }

        String[] s3 = br.readLine().split("");
        int[] C = new int[N]; //앱을 비활성화 했을때 비용
        for (int i = 0; i < N; i++) {
            C[i] = Integer.parseInt(s3[i]);
        }

        //dp 초기화
        for (int i = 0; i < N ; i++) {
            
        }

    }
}
