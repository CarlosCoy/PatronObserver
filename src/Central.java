import java.util.ArrayList;

public abstract class Central {
    protected ArrayList<Bombero> observers;

    public Central() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Bombero observer){
        observers.add(observer);
    }

    public void removeObserver(Bombero observer){
        observers.remove(observer);
    }

    public abstract void notifiy();

    public ArrayList<Bombero> getObservers() {
        return observers;
    }


}
