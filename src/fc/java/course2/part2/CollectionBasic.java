package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList 에 10, 20, 30, 40, 50 5개의 정수(int)를 저장하고 출력하세요.
        // ArrayList -> Object[] <---- int 형 자료형을 넣을 수 없다.
        // ArrayList -> Object[] <---- Integer(Wrapper)
        // ArrayList -> Object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list = new ArrayList</*Integer 써도 되고 안 써도 됨*/>();
        list.add(10); // new Integer(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // int <--(Auto-Unboxing)-- Integer
        for(int data : list){
            System.out.println(data);
        }
    }
}
