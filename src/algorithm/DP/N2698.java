package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2698 {
    //https://www.acmicpc.net/problem/2698
/*
    가장기초
    알고리즘 풀 때 문제를 읽고 문제를 바로 풀면 절대 안됨
    문제를 정확하게 이해하고 정말 디테일하게 전략을 짜야함 ***
    계획을 먼저 세우고 코딩을 시작해야함****
    한글로 먼저하고 그다음에 코딩**

    dp는 결국 dp라는 배열을 만들고 dp배열을 채우면 끝.
    순환식 세우는게 어려워서 문제*
*/
    public static void main(String[] args) throws IOException {
        /////못품
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        //인접한 두수가 11인
        //for문 돌려서
        //첫번쨰수 * 두번쨰수 = 1 인
        //두번쨰수 * 세번쨰수 = 1 인
        //...

        //총 수의 개수는 = 2의 n승
        //수를 중복되지 않게 만듬
        //for문 돌려서 그 수가 조건에 만족하는 수인지 판단함

        //for (int i = 0; i < Math.pow(2, n) ; i++) {

        //}
        //1
        //0

    }
}
