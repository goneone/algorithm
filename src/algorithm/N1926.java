package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N1926 {
    //다시
    //구현중
    static int[] x = {-1,-1,0,0};
    static int[] y = {0,0, -1, -1};
    static int count;
    static int tmp_square;
    static ArrayList<Integer> square = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");

        //도화지의 가로, 세로 크기
        int length = Integer.parseInt(temp[0]); //세로
        int breadth = Integer.parseInt(temp[1]); //가로

        int[][] map = new int[length][breadth];
        boolean[][] visited = new boolean[length][breadth];

        //그림의 정보
        for (int i = 0; i < length; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < breadth ; j++) {
                map[i][j] = Integer.parseInt(tmp[j]);
            }
        }
    }
}
