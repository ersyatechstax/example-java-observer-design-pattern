package main.model;

import java.util.ArrayList;
import java.util.List;

/**
 * created by ersya
 */
public class Observable {

    private List<Observer> observers;

    public Observable(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer Observer){
        observers.add(Observer);
    }

    public void removeObserver(Observer Observer){
        observers.remove(Observer);
    }

    protected void notifyObserver(Observable o){
        observers.forEach(observer -> observer.update(o));
    }

}
