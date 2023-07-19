package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 -> 부모가 명령을 내리면(메세지를 보내면) 오동작을 한다.
        // 다형성을 보장하지 않음 -> 그러면 다형성을 보장하려면? (재정의를 강제로 하도록 만들어주면 된다.)
        // 강제록 하도록 만들어 주기 위해서 추상클래스, 인터페이스 등장
        Animal ani = new Dog();
        ani.eat(); //  개처럼 먹다.

        ani = new Cat();
        ani.eat(); //  고양이처럼 먹다.
    }
}
