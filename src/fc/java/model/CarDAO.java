package fc.java.model;

public class CarDAO {
    // C, R, U, D
    // Create = insert(저장)
    public void carInsert(CarDTO car) {
        // DB 연결, insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }

    public void carSelect() {
        // DB 연결, select SQLs
        System.out.println("car 정보가 출력이 되었습니다.");
    }
}
