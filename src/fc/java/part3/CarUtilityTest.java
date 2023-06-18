package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하세요.
        int carSN = 1110;
        String carName = "BMW5281";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G"; // 'G' -> char

        // 개별로 되어있는 6개의 데이터를 하나로 묶어서 carPrint 로 보내기
        CarDTO car = new CarDTO();
        car.carSn = carSN;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        // carPrint(car);

        // carPrint 메서드는 CarUtilityTest 이라는 메인 클래스 안에
        // 만들어졌기 때문에 다른 클래스에서는 carPrint 메서드를 사용하기 어렵다.
        // 그래서 그 메서드를 CarUtility 이라는 별도의 클래스로 만들 것이다.
        // carPrint 메서드를 없애고 CarUtility 이라는 별도의 클래스 안에
        // 메서드를 만들 것이다. 그래서 다른 클래스들은 필요하면 언제든지 사용 가능하다.

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);

    }
    // 매개변수로 자동차의 정보를 입력받아서 출력하는 매서드를 정의하세요.
    /* public static void carPrint(CarDTO car) {
        System.out.println(car.carSn + "\t " + car.carName + "\t " + car.carPrice + "\t " + car.carOwner + "\t " + car.carYear + "\t " + car.carType);
    } */
}
