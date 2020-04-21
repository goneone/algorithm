package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10773 {
    // https://www.acmicpc.net/problem/10773
    // 스택 관련 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

        for (int i = 0; i < K ; i++) {
            int number =  Integer.parseInt(br.readLine());
            if(number == 0 && stack.isEmpty() == false) {
                stack.pop();
            } else if(number != 0 ){
                stack.push(number);
            }
        }
        //sum
        int sum = 0;
        while(!stack.isEmpty()) {
            System.out.println(sum);
        }

    }
}

