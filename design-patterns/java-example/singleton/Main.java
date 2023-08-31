package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample);

        SingletonExample singletonSecondExample = SingletonExample.getInstance();
        System.out.println(singletonSecondExample);
    }
}
