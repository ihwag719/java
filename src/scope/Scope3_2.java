package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        } // temp 생존 종료. if 문 안에서만 사용하는 지역 변수로 필요할 때만 사용하여 메모리, 코드 효율적
        // System.out.println(temp);
        System.out.println("m = " + m);
    }
}
