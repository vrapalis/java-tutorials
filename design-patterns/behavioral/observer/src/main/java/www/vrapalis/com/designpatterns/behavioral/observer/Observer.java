package www.vrapalis.com.designpatterns.behavioral.observer;

public class Observer<T> {

    public void update(T data) {
        System.out.println(data);
    }
}
