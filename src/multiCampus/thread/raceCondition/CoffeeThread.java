package src.multiCampus.thread.raceCondition;

public class CoffeeThread implements Runnable{

    private Bottle bottle;

    public CoffeeThread(Bottle bottle) {
        super();
        this.bottle = bottle;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {

            System.out.println(Thread.currentThread().getName() + " : 커피 발견!");
            System.out.println(Thread.currentThread().getName() + " : " + bottle.input("커피") + " 마신다.");

        }
    }

}
