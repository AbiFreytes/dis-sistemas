package Observer;

import java.util.ArrayList;

public class AlarmaLibro implements Subject{
    private ArrayList<ILibroMalEstado> observers = new ArrayList<>();

    @Override
    public void attach(ILibroMalEstado observer) {
        observers.add(observer);
    }
    @Override
    public void detach(ILibroMalEstado observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(ILibroMalEstado i : observers){
            i.update();
        }
    }
}
