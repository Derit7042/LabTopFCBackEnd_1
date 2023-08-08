package fc.java.model2;
// BB는 노출을 시키지 않는다. (BB.class 파일만 제공하고, BB.java 소스코드는 제공하지 않는다.)
public class BB implements CC{
    @Override
    public void x() {
        System.out.println("x 동작이 실행된다.");
    }

    @Override
    public void y() {
        System.out.println("y 동작이 실행된다.");
    }

    @Override
    public void z() {
        System.out.println("z 동작이 실행된다.");
    }
}
