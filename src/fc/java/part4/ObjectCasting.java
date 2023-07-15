package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        // ani.night(); // 다운케스팅(DownCasting)
    }
}
