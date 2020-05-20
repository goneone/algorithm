package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N12865 {
    public static void main(String[] args) throws IOException {
        //무게 W
        //가치 V
        //물건들의 가치의 최댓값 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().split(" ")[0]); //물품의 수
        int K = Integer.parseInt(br.readLine().split(" ")[1]); //준서가 버틸수 있는 무게

        int[] W =new int[N]; //물건의 무게 배열
        int[] V =new int[N]; //물건의 가치 배열
        for (int i = 0; i < N; i++) {
            W[i] = Integer.parseInt(br.readLine().split(" ")[0]);
            V[i] = Integer.parseInt(br.readLine().split(" ")[1]);
        }



    }
}

