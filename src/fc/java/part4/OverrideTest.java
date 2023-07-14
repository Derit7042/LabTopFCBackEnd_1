package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅) : Dog.java(x), Animal <--상속관계--> Dog.class(o)
        Animal ani = new Dog();
        ani.eat(); // Animal --(동적바인딩)--> Dog

        ani = new Cat();
        ani.eat(); // Animal --(동적바인딩)--> Cat
    }
}
