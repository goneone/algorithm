package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class N9012 {
    //https://www.acmicpc.net/problem/9012
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String input = "";

        for (int i = 0; i < T; i++) {
            boolean isVPS = true;
            java.util.Stack<Character> tempStack = new Stack<Character>();
            //java.util.Stack tempStack = new Stack();
            input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == '(') {
                    tempStack.push(input.charAt(j));
                } else {
                    if(!tempStack.empty()) {
                        tempStack.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!tempStack.isEmpty()) {
                isVPS = false;
            }
            if(isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
