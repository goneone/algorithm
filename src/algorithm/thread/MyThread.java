package algorithm.thread;

public class MyThread implements Runnable {

    @Override
    public void run() {
        // 1부터 10까지 더해서 결과 출력하기
        int sum=0;
        for(int i=1 ; i <= 10000 ; i++ ) {
            sum = sum + i ;
            System.out.println(i + "+ RESULT: " + sum);
        }

        System.out.println("-------------------------------------");
        System.out.println("1~10 +++: " + sum);
    }
}
