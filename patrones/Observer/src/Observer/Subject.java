package Observer;

import Observer.ILibroMalEstado;

public interface Subject {
    void attach(ILibroMalEstado observer);
    void detach(ILibroMalEstado observer);
    void notifyObservers();
}
