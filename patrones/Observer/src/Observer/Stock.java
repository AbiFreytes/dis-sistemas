package Observer;


public class Stock implements ILibroMalEstado{
    public void update() {
        System.out.println("El libro roto salio de stock");
    }
}
