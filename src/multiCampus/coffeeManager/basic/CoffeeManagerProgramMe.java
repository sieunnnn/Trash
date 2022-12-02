package multiCampus.coffeeManager.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeManagerProgramMe {
    public static void main(String[] args) throws IOException {

        //입력
        int balance = 100000; // 잔고
        int spend = 0; // 지출
        int salePrice = 0; // 매출

        int stockA = 10; // 아메리카노 재고
        int safeStockA = 3; // 아메리카노 안전재고
        int saleA = 0; // 아메리카노 판매량
        int priceA = 3000; // 아메리카노 판매가
        int CostA = 2000; // 아메리카노 매입가

        int stockM = 10; // 모카 재고
        int safeStockM = 3; // 모카 안전재고
        int saleM = 0; // 모카 판매량
        int priceM = 4000; // 모카 판매가
        int CostM = 3000; // 모카 매입가

        int stockL = 10; // 라떼 재고
        int safeStockL = 3; // 라떼 안전재고
        int saleL = 0; // 라떼 판매량
        int priceL = 5000; // 라떼 판매가
        int CostL = 4000; // 라떼 매입가


        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //시작화면
            System.out.println("\n=========Menu=========");
            System.out.println("판매등록(1)");
            System.out.println("현황(2)");
            System.out.println("종료(3)");
            System.out.print("입력: ");
            int number = Integer.parseInt(br.readLine());

            // <판매등록>
            if(number == 1) {
                /*
                아메리카노  판매가 3000원, 매입가 2000원,, 재고 10개, 안전재고 3개;
                모카       판매가 4000원, 매입가 3000원,, 재고 10개, 안전재고 3개;
                라떼       판매가 5000원, 매입가 4000원,, 재고 10개, 안전재고 3개;
                */

                // <판매등록> number=1인 경우
                System.out.println("\n아메리카노(1)");
                System.out.println("모카(2)");
                System.out.println("라떼(3)");

                // 판매 이벤트
                System.out.print("\n * 판매한 커피코드 : ");
                int coffeeCode = Integer.parseInt(br.readLine());
                System.out.print(" * 판매량 : ");
                int sale = Integer.parseInt(br.readLine());

                /*
                주문량이 재고보다 적거나 같으면 판매 수량만큼 재고를 차감하고, 잔고에 판매 금액을 반영한다.
                    커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
                    잔고가 부족해 매입이 불가능하면 안전재고 매입을 취소한다.
                주문량이 재고보다 많으면 주문을 취소한다.
                 */

                // <아메리카노>
                if(coffeeCode == 1) {
                    //판매
                    if(sale <= stockA) {
                        saleA += sale;
                        stockA -= sale;
                        salePrice += (priceA*sale);
                        balance += salePrice;

                        if(stockA < safeStockA) {
                            System.out.println("[System:log] 재고가 부족해 안전재고를 확보합니다.");

                            // 잔고 판단
                            if (balance > CostA * 2 * safeStockA) {
                                balance -= CostA * 2 * safeStockA;
                                spend += CostA * 2 * safeStockA;
                                stockA += 2 * safeStockA;

                                System.out.printf("[System:log] 아메리카노 재고: %d %n", stockA);
                            } else {
                                System.out.println("[System:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
                            }

                        }
                        System.out.println("\n제품명 : 아메리카노");
                        System.out.println("판매가 : 3000");
                        System.out.printf("판매수량 : %d %n",sale);
                        System.out.println("결재금액 : "+(sale*priceA));
                        System.out.printf("남은재고 : %d %n",stockA);

                    } else {
                        System.out.println("[System:log] 재고가 부족하여 주문을 취소합니다.");

                    }
                }else  if(coffeeCode == 2) {  // <모카>
                    //판매
                    if(sale <= stockM) {
                        saleM += sale;
                        stockM -= sale;
                        salePrice += (priceM*sale);
                        balance += salePrice;

                        if(stockM < safeStockM) {
                            System.out.println("[System:log] 재고가 부족해 안전재고를 확보합니다.");

                            // 잔고 판단
                            if (balance > CostM * 2 * safeStockM) {
                                balance -= CostM * 2 * safeStockM;
                                spend += CostM * 2 * safeStockM;
                                stockM += 2 * safeStockM;

                                System.out.printf("[System:log] 모카 재고: %d %n", stockM);
                            } else {
                                System.out.println("[System:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
                            }

                        }
                        System.out.println("\n제품명 : 모카");
                        System.out.println("판매가 : 4000");
                        System.out.printf("판매수량 : %d %n",sale);
                        System.out.println("결재금액 : "+(sale*priceL));
                        System.out.printf("남은재고 : %d %n",stockM);

                    } else {
                        System.out.println("[System:log] 재고가 부족하여 주문을 취소합니다.");
                    }

                } else if(coffeeCode == 3) {  // <모카>
                    //판매
                    if (sale <= stockL) {
                        saleL += sale;
                        stockL -= sale;
                        salePrice += (priceL * sale);
                        balance += salePrice;

                        if (stockL < safeStockL) {
                            System.out.println("[System:log] 재고가 부족해 안전재고를 확보합니다.");

                            // 잔고 판단
                            if (balance > CostL * 2 * safeStockL) {
                                balance -= CostL * 2 * safeStockL;
                                spend += CostL * 2 * safeStockL;
                                stockL += 2 * safeStockL;

                                System.out.printf("[System:log] 모카 재고: %d %n", stockL);
                            } else {
                                System.out.println("[System:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
                            }

                        }
                        System.out.println("\n제품명 : 라떼");
                        System.out.println("판매가 : 5000");
                        System.out.printf("판매수량 : %d %n", sale);
                        System.out.println("결재금액 : " + (sale * priceL));
                        System.out.printf("남은재고 : %d %n", stockL);

                    } else {
                        System.out.println("[System:log] 재고가 부족하여 주문을 취소합니다.");
                    }

                } else {
                    System.out.println("올바른 메뉴를 선택해 주세요.");
                }
            } else if(number == 2) {
                // <현황>
                System.out.printf("\n아메리카노 재고 : %d | 판매량 : %d %n", stockA, saleA);
                System.out.printf("모카 재고 : %d | 판매량 : %d %n", stockM, saleM);
                System.out.printf("라떼 재고 : %d | 판매량 : %d %n", stockL, saleL);
                System.out.printf("잔고 : %d | 매출 : %d | 지출 : %d %n", balance, salePrice, spend);

            } else if(number == 3) {
                // <종료>
                System.out.println(" * 프로그램을 종료합니다.");
                break;
            }

        }
    }
}
