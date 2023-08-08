package fc.java.model2;
// 자바에서 제공을 하는 인터페이스. 이 인터페이스를 구현한 구현체는 벤더들이 만든다.
public interface Connection {
    // 데이터베이스 연결동작
    public void getConnection(String url, String username, String password);

}
