package main;

public class SingletonTest {
    private static SingletonTest instance;

    private SingletonTest(){};
    public static SingletonTest getInstance(){
        if (instance == null) {
            return instance;
        }
        return instance;
    }
}
