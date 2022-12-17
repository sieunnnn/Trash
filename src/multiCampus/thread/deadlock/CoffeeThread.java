package src.multiCampus.thread.deadlock;

public class CoffeeThread implements Runnable{

    private Bottle bottle;

    public CoffeeThread(School school, Bottle bottle) {
        super();
        this.bottle = bottle;
    }

    @Override
    public void run() {

        while(true) {

            School.leaveSchool("커피소년");
            System.out.println(Thread.currentThread().getName() + " : 커피 발견!");
            System.out.println(Thread.currentThread().getName() + " : " + bottle.input("커피") + " 마신다.");

        }
    }

}
