package main.Java实战.chapter09.p9_2_02;

public interface Subject {

    void registerObserver(Observer observer);
    void notifyObservers(String news);
}
