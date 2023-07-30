package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 [배열]에 저장하고 출력하세요.
        BookArray list = new BookArray(); // 책이라는 배열 생성, 길이 5
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정도", "나길동"));

        //Book vo = list.get(0);
        System.out.println(list.get(0)); // vo.toSting(); // Book{title='자바', price=15000, company='한빛', author='홍길동'}

        //vo = list.get(1);
        System.out.println(list.get(1)); // vo.toSting(); // Book{title='C++', price=17000, company='대림', author='이길동'}

        //vo = list.get(2);
        System.out.println(list.get(2)); // vo.toSting(); // Book{title='Python', price=16000, company='정도', author='나길동'}

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
