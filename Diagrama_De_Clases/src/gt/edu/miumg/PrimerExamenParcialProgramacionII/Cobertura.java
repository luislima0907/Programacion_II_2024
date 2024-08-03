package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Cobertura implements Ingrediente{
    private String nombre;
    private double cantidad;
    private String tipo;


    public Cobertura(String nombre, double cantidad, String tipo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
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
