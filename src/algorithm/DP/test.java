package algorithm.DP;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.remove(1);

        arrayList.set(1, 100);
        arrayList.add(1, 1985);
        //System.out.println(arrayList.get(1));
        //System.out.println(arrayList.get(2));
        System.out.println(arrayList.set(6, 12345));
    }


}
