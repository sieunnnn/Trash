package multiCampus.ex.EX1202_Concert;

public class EX120208 {
    public void startConcert() {
        System.out.println("봄 콘서트 시작합니다!");

        EX120207 player = new EX120207("바이올린");
        player.play();

        System.out.println("봄 콘서트를 마무리 합니다!!");
    }
}
