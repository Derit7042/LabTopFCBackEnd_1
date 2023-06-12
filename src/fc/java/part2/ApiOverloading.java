package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");
        // 자바에서 println 을 Overloading 시켜서 여러개를 만들어놨다는 것이다.
        // 이것이 바로 Method 의 Overloading 이다.
        // 자바에서 print 를 한 개만 만든 것이 아니라 여러 개를 만들어서
        // 정수를 받아서도 출력할 수 있고, 실수, 문자, 문자열 등등을 받아서 출력할 수 있도록
        // 다양하게 메서드 이름을 println 으로 통일시켜서 만들어놨다.
        // 그래서 우리는 println 하나만으로 모든 데이터를 전부 출력할 수 있다.
        // 이것이 Overloading 의 장점이다.

        int max = maxValue(7, 9);
        System.out.println("max = " + max);

        int min = minValue(3, 8);
        System.out.println("min = " + min);
    }

    // Q. 두 개의 정수를 매개변수로 받아서 더 큰 수를 리턴하는 메서드를 정의하시오.
    public static int maxValue(int a, int b) {
        return (a>b) ? a : b;
    }

    // Q. 두 개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드를 정의하시오.
    public static int minValue(int a, int b) {
        return (a<b) ? a : b;
    }
}
