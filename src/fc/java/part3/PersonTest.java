package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 [사람]의 데이터를 저장할 [변수를 선언]하세요.
        //Person p; // 원래는 fc.java.part3.Person p 라고 해야하지만
                    // 같은 디렉토리 안에 있기 때문에 Person p 만 써도 된다.
        //p = new Person();

        // 모델링 된 Person 클래스를 이용하여 [객체를 메모리에 생성]하세요.
        // [인스턴스를 만드는 과정]
        // Person p = new Person(); // new Person(); 이 인스턴스? // p는 인스턴스 변수
        Person p = new Person();
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";
        System.out.println(p.name + "\t" +  p.age + "\t" +  p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name = "나길동";
        p1.age = 34;
        p1.phone = "010-2222-1111";
        System.out.println(p1.name + "\t" +  p1.age + "\t" +  p1.phone);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
