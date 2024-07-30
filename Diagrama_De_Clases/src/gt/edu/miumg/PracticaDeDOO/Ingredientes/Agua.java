package gt.edu.miumg.PracticaDeDOO.Ingredientes;

public class Agua implements Ingrediente {
    private String nombre;
    private double cantidad;

    public Agua(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public double ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return nombre;
    }
}
