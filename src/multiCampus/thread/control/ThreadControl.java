package src.multiCampus.thread.control;

public class ThreadControl implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {

                System.out.println(Thread.currentThread().getName() + ":" + i + "초");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(" >>> ");
            }
        }
    }

}
