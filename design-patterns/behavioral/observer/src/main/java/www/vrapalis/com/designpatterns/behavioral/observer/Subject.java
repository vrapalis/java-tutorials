package www.vrapalis.com.designpatterns.behavioral.observer;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Subject<T> {
    private final List<Observer<T>> observers;

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(T data) {
        observers.forEach(observer -> observer.update(data));
    }
}
