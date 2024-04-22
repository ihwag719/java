package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // if 코드 블록에서만 필요한데, main에서 선언 -> 비효율적인 메모리 사용, 코드 복잡성 증가
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
