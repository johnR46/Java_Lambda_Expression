@FunctionalInterface
interface F1 {
    abstract void println();
}

@FunctionalInterface
interface F2 {
    abstract void increase(int a);
}

@FunctionalInterface
interface F3 {
    abstract int  greater(int a, int b);
}

public class Example9 {
    static String job = "Programmer";

    public static void main(String[] args) {

        F1 f1 = () -> System.out.println("I println. ");
        f1.println();

        F2 f2 = (a) -> System.out.println(a++);
        f2.increase(5);

        F3 f3 = (a, b) -> (a > b) ? a : b;
        int a = f3.greater(2, 3);
        println(a);

    }

    static void println(Object obj) {
        System.out.println(obj.toString());
    }
}
