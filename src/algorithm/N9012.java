package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N9012 {
    //https://www.acmicpc.net/problem/9012
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String value = "";

        for (int i = 0; i < T; i++) {
            Stack tempStack = new Stack();
            value = br.readLine();
            for (int j = 0; j < value.length(); j++) {
                if(value.substring(j, j+1) == "(") {
                    tempStack.push(1);
                } else {
                    if(tempStack.size() == 0) {
                        break;
                    } else {
                        tempStack.pop();
                    }
                }
            }
            if(tempStack.size() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
