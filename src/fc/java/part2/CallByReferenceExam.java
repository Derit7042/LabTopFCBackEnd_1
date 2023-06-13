package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        // 배열의 총합을 구하여 출력하세요.
        int result = addArray(a); // 번지 전달 (Call By Reference)
        System.out.println("result = " + result);
    }

    // Q. 매개변수로 정수형 배열을 받아서 / 배열의 총합을 구하여 / 리턴하는 / 메서드를 정의하세요.
    public static int addArray(int[] x) {   //int[] a 에서 a 대신 다른 문자도 가능
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            sum = sum + x[i]; // sum += a[i]
        }
        return sum;
    }
}