package sujeet.cs665;

public interface Department {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
