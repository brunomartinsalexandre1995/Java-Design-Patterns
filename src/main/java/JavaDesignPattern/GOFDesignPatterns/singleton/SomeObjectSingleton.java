package JavaDesignPattern.GOFDesignPatterns.singleton;

import java.util.Date;

public final class SomeObjectSingleton {

    private static SomeObjectSingleton instance;
    private static Date createdDate;

    private SomeObjectSingleton(){
        createdDate = new Date();
    }

    public static synchronized SomeObjectSingleton getInstance(){
        if(instance == null) {
            synchronized (SomeObjectSingleton.class) {
                if (instance == null) {
                    instance = new SomeObjectSingleton();
                }
            }
        }

        return instance;
    }

    @Override
    public String toString(){
        return createdDate.toString();
    }

}
