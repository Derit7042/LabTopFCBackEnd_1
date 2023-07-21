package fc.java.poly;

public class Board extends Object{ // Object 클래스 안에는 toString() 이라는 메서드가 있다.
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    // Override (재정의)
    public String toString(){
        return  title; // 문자열
    }

     */
    // 모든클래스는 일반적으로 Object 클래스를 상속받아서 toString() 을 재정의 해서 쓰는 것이 일반적이다.
    // 좌클릭 -> Generate -> toString()

    @Override
    public String toString() {
        // System.out.println(super.toString()); // 상위클래스의 메서드 호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
