package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Relleno implements Ingrediente{
    private String nombre;
    private String sabor;
    private double cantidad;

    public Relleno(String nombre, String sabor, double cantidad) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return nombre;
    }

    @Override
    public double ObtenerCantidad() {
        return cantidad;
    }
}
