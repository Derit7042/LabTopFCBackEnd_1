package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "홍길동";
        p.age = 1000; // 나이가 1000인 것은 상식적으로는 이상하지만 아무 문제 안 된다.
        p.phone = "010-1111-1111";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
        // 나이가 1000이라는 값이 출력된 것은 객체에 잘못된 값이 들어가 있다는 것을 알 수 있다.
        // 그런데 아무 제약이 없어서 1000으로 해도 아무 문제가 되지 않는다.
        // 어떻게 해결해야할까? 그런 것을 막는 것이 접근 제어이다.

    }
}
