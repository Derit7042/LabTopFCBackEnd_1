package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        // System.out.println(b.getTitle());
        System.out.println(b.toString()); // fc.java.poly.Board@4eec7777 -> 게시글입니다. 를 나오게 하고 싶다.
        System.out.println(b); // fc.java.poly.Board@4eec7777 -> 게시글입니다. 를 나오게 하고 싶다.
        // 게시글입니다. 를 나오게 하고 싶으면 toString() 을 재정의를 해야한다.  poly 패키지에 Board.java 참고
    }
}
