package fc.java.poly;
// 추상클래스 = 추상메서드 + 구현메서드
public abstract class RemoCon {
    // chUp(), chDown(), volUp(), volDown()
    public abstract void chUP();
    public abstract void chDown();
    public abstract void volUP();
    public abstract void volDown();
    public void internet(){
        System.out.println("인터넷이 구동된다.");
    }
}
