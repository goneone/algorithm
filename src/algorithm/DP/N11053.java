package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11053 {
    public static void main(String[] args) throws IOException {
        //가장 긴 증가하는 부분 수열의 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A = new String[N];
        A = br.readLine().split(" ");

        //왼쪽수보다 오른쪽 수가 크다
        //배열에 수를 넣어뒀다가
        //A B  C가 등장했을때 A보단 크고 B보단 작다면 B와 C를 교체
        //dp[] = 가장 긴 증가하는 부분 수열이 담겨야함.
        //처음에 첫번쨰 숫자 담음
        //a,b 비교 작으면 그대로
        //10 11 12 13 /  9 20 10 21 30 10 20 30 35 40 50
        //dp[1]은 첫번쨰 시작한 수열이라 치자
        //dp[1]의 첫번째 값보다 작은 수가 나온다면
        //걔를 dp[2]라고함
        //dp[2] 에 값을 담기 시작하다가
        //dp[1]의 마지막 값보다 큰 숫자가 나올때까지
        //dp[1]의 마지막 값보다 큰 숫자가 나왔는데 dp[2]의 개수가 더길면
        //dp[1]은 버림
        //10 20 10 30 20 1 2 3 4 5 6 7 8 9 10 28 30 33 40 50
        //dp[1][1] = 10;
        //dp[1][2] = 20;
        //dp[1][3] = 30;
        //넣은값보다 작으면 무조건 넣는다.
        //더 작은 수가 나온다면 걔를  배열로 하나 더 만들어둠.
        //dp[2][1] = 1;
        //dp[2][2] = 2;

        //dp[0][0]은 첫번째로 나온 숫자의 첫번쨰 수열 값
        int[][] dp = new int[N][N]; //앞에 n은 맨앞에 수 보다 작은 개수가 몇 개인지 세워봐서 넣어도 될라나

        dp[0][0] = Integer.parseInt(A[0]); //수열의 첫번째 값을 넣는다
        dp[0][1] = Integer.parseInt(A[1]);
        for (int i = 2; i < N; i++) {
            if(Integer.parseInt(A[2]) > Integer.parseInt(A[1])) { //수열의 3번째 값이 2번째 값보다 크면
                dp[0][2] = Integer.parseInt(A[1]);
            }
        }



    }
}
