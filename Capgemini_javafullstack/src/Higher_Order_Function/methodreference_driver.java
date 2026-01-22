package Higher_Order_Function;

public class methodreference_driver {

    public static void m1() {
        System.out.println("something");
    }

    public static void main(String[] args) {

        methodreference i = methodreference_driver::m1;
        i.m1();
    }
}
