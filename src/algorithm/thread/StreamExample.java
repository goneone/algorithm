package algorithm.thread;

import java.util.*;

public class StreamExample {

    public static void main(String[] args) {
        //문제 intArr 배열을 중복 제거하고 내림차순으로 반환하라 
        int[] intArr = {1,1,2,3,30,36,38,40};
        List<Integer> list = new ArrayList<>();

        //1.Stream을 쓰지 않았을 경우 
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < intArr.length; i++) {
            set.add(intArr[i]);
        }

        //2.set을 iter에 담기.
        Iterator<Integer> iter = set.iterator();

        //3.iter를 list에 담기.
        for (int i = 0; iter.hasNext() ; i++) {
            list.add(iter.next());
        }



        /*
        //2.set 출력
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
        }
        */

    }
    
    
    
    
    
    
    
}
