package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        // Book[], Object[]
        // ArrayList 는 ObjectArray 와 유사하다.
        ArrayList list = new ArrayList(1); // 기본크기(10) : Object[]
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정도", "나길동"));

        Book vo = (Book)list.get(0); // Book <--- (Book)Object   다운캐스팅
        System.out.println(vo);

        vo = (Book)list.get(1); // Book <--- (Book)Object   다운캐스팅
        System.out.println(vo);

        vo = (Book)list.get(2); // Book <--- (Book)Object   다운캐스팅
        System.out.println(vo);

        for (int i = 0; i<list.size(); i++){
            System.out.println(/*(Book)*/list.get(i)); // Object -> Book(JVM 에서 자동으로 Book 의 toString() 을 호출)

        }

    }
}
