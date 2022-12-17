package src.multiCampus.thread.thread.runnable;

public class _Runnable implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            // 쓰래드 이름을 출력
            System.out.println(i + ":" + Thread.currentThread().getName());
        }

    }

}
