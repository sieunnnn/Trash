package multiCampus.ex.EX1202_Concert;

public class EX120207 {

    //객체는 자율성을 지녀야 한다.
    private String instrument;

    public EX120207 (String instrument) {
        this.instrument = instrument;
    }

    public void play() {
        prepare();
        playing();
        end();
    }

    private void prepare() {
        System.out.println(instrument + "를 연주할 준비 중입니다.");
    }

    private void playing() {
        System.out.println(instrument + "를 연주하고 있습니다.");
    }

    private void end() {
        System.out.println(instrument + "를 마치고 관객에게 인사합니다.");
    }

}
