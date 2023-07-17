package fc.java.part4;

import fc.java.model.*;


public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    //private static void display(Cat c) {
    //    c.eat();
    //}

    //private static void display(Dog d) {
    //    d.eat();
    //}

    private static void display(Animal ani) { // 다형성 인수
        ani.eat();

        // Cat 타입으로 받은 경우에만 실행 -> if 문을 써야한다.
        if (ani instanceof Cat){
            ((Cat)ani).night(); // Cat
        }
    }


}
