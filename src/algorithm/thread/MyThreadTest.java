package algorithm.thread;

public class MyThreadTest {

    public static void main(String[] args) {
        Runnable r = new MyThread();
        Thread t = new Thread(r);
        t.start();

        // main스레드에서는 1 ~ 10까지 곱해서 결과를 출력하는 일을 한다.
        long multiply=1;
        for(long i=1 ; i <= 10000 ; i++ ) {
            multiply = multiply * i ;
            System.out.println(i + "X RESULT: " + multiply);
        }

        System.out.println("-------------------------------------");
        System.out.println("1~10 XXXX : " + multiply);
    }
}
