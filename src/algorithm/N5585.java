package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5585 {
    /*타로는 자주 JOI잡화점에서 물건을 산다.
    JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
    타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.

    예를 들어 입력된 예1의 경우에는 아래 그림에서 처럼 4개를 출력해야 한다.*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 1000 - Integer.parseInt(br.readLine());
        int result = 0;

        while(true) {
            if(input >= 500  ) {
                result += input/500;
                input = input % 500;
            }

            if(input >= 100 ) {
                result += input/100;
                input = input % 100;
            }

            if(input >= 50 ) {
                result += input/50;
                input = input % 50;
            }

            if(input >= 10 ) {
                result += input/10;
                input = input % 10;
            }

            if(input >= 5 ) {
                result += input/5;
                input = input % 5;
            }

            if(input < 5) {
                result += input;
                break;
            }
        }
        System.out.println(result);
    }
}
