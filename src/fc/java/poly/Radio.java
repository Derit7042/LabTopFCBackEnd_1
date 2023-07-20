package fc.java.poly;

public class Radio extends RemoCon{
    // chUp(), chDown(), volUp(), volDown()
    @Override
    public void chUP() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }

    @Override
    public void volUP() {
        System.out.println("Radio의 소리가 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 소리가 내려간다.");
    }
}
