package www.vrapalis.com.designpatterns.behavioral.observer;

import java.util.Arrays;

public class ObserverRunner {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern Running ...");
        new Subject<String>(Arrays.asList(new Observer<String>(), new Observer<>()))
                .notifyObservers("Updated data");
    }
}
