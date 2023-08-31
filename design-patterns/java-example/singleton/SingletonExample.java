package singleton;

//Lazy initialization
public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample(){
    }

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
