package algorithm;

import java.util.Arrays;

public class programmers_array1 {
	public static void main(String[] args) {
		
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		solution(array,commands);
	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int z = 0; z < commands.length; z++) {
            int i = commands[z][0] ; //2
            int j = commands[z][1] ; //5
            int k = commands[z][2] ; //3
            
            //1.자르기 - 배열 i부터 j까지의 값을 잘라서 배열 만들기  i-1부터 j-1까지 
            int[] tempArray = Arrays.copyOfRange(array, i-1, j);
            
            //2.배열 정렬
            //Arrays.sort(tempArray);
            
           /* int temp;
            for (int l = 0; l < tempArray.length; l++) {
            	for (int l2 = 0; l2 < tempArray.length -1 -i; l2++) {
            		if(tempArray[l2] < tempArray[l2+1]) {
            			temp = tempArray[l2];
            			tempArray[l2] = tempArray[l2+1];
            			tempArray[l2+1] = temp;
            		}
				}
			};*/
            answer[z] = tempArray[k-1];
            System.out.println(tempArray[k-1]);
			//answer[z] = tempArray[k-1];
			//System.out.println(answer[z]);
			
        }
        return answer;
    }
}
