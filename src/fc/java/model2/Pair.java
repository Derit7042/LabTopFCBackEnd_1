package fc.java.model2;
// Generic 을 사용하면 코드의 유연성이 좋아지고, 재사용성이 높아지고, 타입의 안전성을 보장한다.
public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
