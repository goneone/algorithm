package algorithm.DP;

public class Programmers_DP2 {

    public int solution(int[][] triangle) {

        int max = 0;

        //trianlge[][] = 거쳐간 숫자의 최댓값을 담은 배열
//
        for(int i = 1; i< triangle.length; i++) {
            for(int j = 0; j<= i; j++) {
                if(j == 0) { //맨 왼쪽 일 때
                    triangle[i][0] += triangle[i-1][0] ;
                } else if (i == j) { //맨 오른쪽 일 때
                    triangle[i][j] += triangle[i-1][j-1];
                } else { //그 외
                    triangle[i][j] += Math.max(triangle[i-1][j-1],triangle[i-1][j]);
                }

                if (i == triangle.length - 1)
                    max = Math.max(max, triangle[i][j]);
            }
        }

        return max;
    }
}
