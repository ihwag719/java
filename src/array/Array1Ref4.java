package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        // 편리하고 간략한 배열 생성과 초기화 -> 학생의 점수를 추가해도 초기화만 변경하면 됨

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
