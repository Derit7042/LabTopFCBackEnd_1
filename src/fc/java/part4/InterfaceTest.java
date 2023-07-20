package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100% 보장된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수 있다.
        // RemoCon r = new RemoCon(); 객체생성 불가
        // 객체생성은 불가하지만 부모의 역할은 할 수 있다.
        RemoCon remo = new Radio();
        remo.chUP();
        remo.chDown();
        remo.volUP();
        remo.volDown();
        remo.internet(); // "Radio 에서는 인터넷이 지원이 안 됩니다."

        remo = new TV();
        remo.chUP();
        remo.chDown();
        remo.volUP();
        remo.volDown();
        remo.internet(); // TV 에서 인터넷이 실행된다.
    }
}
