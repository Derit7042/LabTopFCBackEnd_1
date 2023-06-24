package fc.java.part3;
// import java.lang.*; 이 생략되어 있다.  default package 라서 항상 임포트 된다.
import java.util.*;
import fc.java.model.*;
public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        // Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자.
        CarDTO car = new CarDTO();
        CarDAO dao = new CarDAO();
    }
}
