package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
        // 조건을 만족하지 않을 경우가 없다면, return문 실행 x.
        // java: missing return statement
    }
}
