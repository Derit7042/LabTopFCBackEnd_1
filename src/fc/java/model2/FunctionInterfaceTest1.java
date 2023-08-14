package fc.java.model2;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
