package Observer;

public class Biblioteca {
    public void devuelveLibro(Libro libro)
    {
        if(libro.getEstado().equals("MALO"))
        {
            AlarmaLibro alarm = new AlarmaLibro();
            alarm.notifyObservers();
        }
    }
}
