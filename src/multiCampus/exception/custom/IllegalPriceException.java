package src.multiCampus.exception.custom;

// UnCheckedException : RuntimeException 을 상속 받아 구현
public class IllegalPriceException extends RuntimeException {
    private static final long serialVersionUID = 7520343738510302872L;

    public IllegalPriceException() {
        super("가격은 0보다 작을 수 없습니다.");
    }

    public IllegalPriceException(String message) {
        super(message);
    }

}
