package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 동일.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        // 연산자 우선 순위가 복잡한 경우, 괄호를 명시적으로 사용하는 것이 명확하고 단순해짐.
        // 명확하고 단순한 코드가 유지 보수하기 쉬움.
    }
}
