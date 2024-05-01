package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
        // * 자바는 항상 변수의 값을 복사해서 대입한다.
        // 실행결과 -> 5
        // 매개변수 num2만 변경되고, 복사해서 전달한 num1에는 영향을 주지 않음
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }

}
