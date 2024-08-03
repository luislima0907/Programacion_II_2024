package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Masa implements Ingrediente{
    private String nombre;
    private String tipo;
    private double cantidad;


    public Masa(String nombre, String tipo, double cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
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
