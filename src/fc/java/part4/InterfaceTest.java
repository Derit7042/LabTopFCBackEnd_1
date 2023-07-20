package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        RemoCon remo = new Radio();
        remo.chUP();
        remo.chDown();
        remo.volUP();
        remo.volDown();
        remo.internet(); // 오동작

        remo = new TV();
        remo.chUP();
        remo.chDown();
        remo.volUP();
        remo.volDown();
        remo.internet(); // 오동작
    }
}
