package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting 으로 객체를 생성
        // 상속관계, 재정의(Override), 동적바인딩
        // 다형성(message polymorphism)
        // 상위 클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal ani = new Dog();
        ani.eat(); // 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인등(동적바인딩)

        ani = new Cat();
        ani.eat();
        // Downcasting
        ((Cat)ani).night();

        // Overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // Overloading -> 프로그램의 실행 속도와는 관계가 없다.
        // Override(재정의)     : 동적바인딩 = 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인등
        // Override -> 프로그램의 실행 속도와 관계가 있다.
        // 실행 시점에서 사용될 메서드를 찾아가야한다. 그래서 프로그램의 실행 속도가 떨어지는 원인이 될 수 있다. (개념상. 체감상 X)
    }
}
