package Observer;

public class Main {
    public static void main(String[] args) {
        Biblioteca bi1 = new Biblioteca();
        Libro li1 = new Libro("Bueno","Dessign Pattern");
        li1.setEstado("MALO");

        //observadores
        AlarmaLibro alarma = new AlarmaLibro();

        Administracion admin = new Administracion();
        alarma.attach(admin);
        Stock st = new Stock();
        alarma.attach(st);
        Compras com = new Compras();
        alarma.attach(com);


        bi1.devuelveLibro(li1);

    }
}
