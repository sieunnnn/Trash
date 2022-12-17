package src.multiCampus.thread.thread.runnable;

/*
DaemonThread
    (1) 다른 쓰래드를 보조하는 용도로 사용하는 쓰래드
    (2) 자신을 제외한 모든 쓰래드가 종료되면, 데몬쓰래드는 자동으로 종료
 */
public class DaemonThread extends _Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            //쓰래드 이름을 출력
            System.out.println(i + ":" + Thread.currentThread().getName());
        }

    }

}
