package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
        // 최초 한 번은 항상 실행. 다음 조건 검사
    }
}
