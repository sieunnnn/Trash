package multiCampus.coffeeManager.arrOop.prof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeManagerProgramProfArrClass {

    public static void main(String[] args) throws IOException {

        int balance = 100000;//잔고 100000
        int salesPrice = 0;//매출
        int expences = 0;//지출

        /*
        <인스턴스화>
            인스턴스.객체의 속성 = ;
         */

        Coffee americano = new Coffee("아메리카노",3000,2000,10,3,0);
        Coffee moca = new Coffee("모카",4000,3000,10,3,0);
        Coffee latte = new Coffee("라떼",5000,4000,10,3,0);
        Coffee[] drinks = {americano, moca,latte};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("\n=========Menu=========");
            System.out.println("판매등록(1)");
            System.out.println("현황(2)");
            System.out.println("종료(3)");
            System.out.print("입력 : ");

            int inputMenu = Integer.parseInt(br.readLine());

            if (inputMenu == 1) {
                //음료 메뉴판
                for (int i = 0; i < drinks.length; i++) {
                    System.out.println(drinks[i].name + "(" + i + ")");
                }

                System.out.print("\n * 판매한 커피코드 : ");
                int inputCode = Integer.parseInt(br.readLine());
                System.out.print(" * 판매량 : ");
                int orderCnt = Integer.parseInt(br.readLine());

                if (inputCode < 0 || inputCode >= drinks.length) {
                    System.out.println("정확한 상품번호를 선택해 주세요.");
                    continue;
                }
                if (orderCnt > drinks[inputCode].stock) {
                    //주문량이 재고보다 많으면 주문을 취소한다.
                    System.out.println("재고가 부족해 주문을 취소합니다.");
                    continue;
                }

                //주문량이 재고보다 적거나 같으면 판매 수량만큼 재고를 차감하고,
                //잔고에 판매 금액을 반영한다.
                drinks[inputCode].stock -= orderCnt;
                balance += drinks[inputCode].Price * orderCnt;
                salesPrice += drinks[inputCode].Price * orderCnt;
                drinks[inputCode].salesCnt += orderCnt;

                //커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
                if (drinks[inputCode].stock < drinks[inputCode].safetyStock) {
                    if (balance > drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost) {
                        drinks[inputCode].stock += drinks[inputCode].safetyStock * 2;
                        balance -= drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost;
                        // 지출등록
                        expences += drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost;
                        System.out.println("[system:log] 안전재고를 확보하였습니다.");
                    } else {
                        //잔고가 부족해 매입이 불가능하면 안전재고 매입을 취소한다.
                        System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
                    }
                }
                System.out.println("\n 제품명 : 아메리카노");
                System.out.println(" 판매가 : " + drinks[inputCode].Price);
                System.out.println(" 판매수량 : " + orderCnt);
                System.out.println(" 결제금액 : " + (drinks[inputCode].Price  * orderCnt));
                System.out.println(" 남은 재고 : " + drinks[inputCode].stock);

            } else if (inputMenu == 2) {

                for (int i = 0; i < drinks.length; i++) {
                    System.out.println(drinks[i].name + " 재고 : " + drinks[i].stock + " | 판매량 : " + drinks[i].salesCnt);
                }
                System.out.println("잔고 : " + balance + " | 매출 : " + salesPrice + " | 지출 : " + expences);

            } else if (inputMenu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("알맞은 번호를 입력하세요.");
            }

        }
    }

}
