package algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class N2667usingDFS {
    static public int[][] map;
    static public int[] x = {-1,0,1,0}; //위 , 오른쪽 , 아래, 왼쪽
    static public int[] y = {0,1,0,-1};
    static public int[][] visit;
    static public int cnt =0;
    static public int N; //행과 열의 수

    public static void main(String[] args) throws IOException {

        //1. 지도의 크기 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        //2. N개의 자료 입력 받기
        map = new int[N][N];
        visit = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] temp =br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        ArrayList danji = new ArrayList();
        //3. 단지 수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1 && visit[i][j] == 0) {
                    cnt = 1;
                    visit[i][j] = 1;
                    dfs(i, j);
                    danji.add(cnt);
                }
            }
        }

        //4. 정렬해서 출력
        Collections.sort(danji);
        bw.write("" + danji.size());
        bw.newLine();
        for (int i = 0; i < danji.size(); i++) {
            bw.write(""+danji.get(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int i, int j){
        //4방향을 다 검사함.
        for(int k=0; k<4; k++){
            int ni = i + x[k]; //배열의 열
            int nj = j + y[k]; //배열의 행
            if(ni>=0 && ni<N && nj >=0 && nj<N){ //지도를 벗어나지 않고
                if(visit[ni][nj]==0 && map[ni][nj] == 1){ //내가 방문을 처음 했고 , map이 1이다(집이 있다).
                    visit[ni][nj] = 1; //방문했다 표시해주고.
                    cnt++; //단지 갯수 세는거?
                    dfs(ni, nj);
                }
            }
        }

    }
}


/*

안녕하세요! 제 블로그를 방문해주셔서 감사합니다!

        2차월 배열에서 dx는 배열의 열을 뜻하며 dy는 배열의 행을 의미합니다.

        그러기에 dx=-1, dy=0인 경우에는 nx = x + dx[i]를 했을 때 x에서 위로 한칸 ny = y + dy[i]를 했을 때는 제자리가 됩니다.(이동한게 없으니)

        예를 들어서 현재 위치가 map[3][3]이라고 한다면 dx=-1, dy=0 일때 map[2][3]이 되기 때문에 map에서 한칸 위로 올라간 모양임을 알 수 있습니다.

        같은 방식으로 나머지들도 다 적용하면 배열 map에서 위, 오른, 아래, 왼 순서임을 알 수 있습니다.*/
