package fc.java.poly;

public class Cat extends Animal { // Animal -> eat() {?}
    // 재정의를 하지 않음(x)
    public void night(){
        System.out.println("밤에 눈에서 빛이난다.");
    }
    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }
}
