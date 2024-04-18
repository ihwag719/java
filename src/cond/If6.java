package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // if문에서 이미 만족되어, 다른 조건문 검사 중복 x
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // 가독성과 유지보수성 면에서 중괄호를 사용하는 것이 바람직함.
    }
}
