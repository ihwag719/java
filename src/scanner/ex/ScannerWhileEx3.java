package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        // 방법 1
        while (true) {
            int nums = scanner.nextInt();

            if (nums == -1) {
                break;
            }

            sum += nums;
            count++;
        }

        /* 방법 2
        int nums = 0;
        while ((nums = scanner.nextInt()) != -1) {
            sum += nums;
            count++;
            }
         */

        double average = (double) sum / count; // 캐스팅
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
