package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil
        int sum = MyUtil.hap(a, b); // 클래스이름.호출메서드 hap 메서드가 static 이라서 15도 기울어진다.
        System.out.println("sum = " + sum);

    }
}
