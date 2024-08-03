package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public abstract class Postre {
    private String nombre;
    private String tamano;
    private int precio;
    private Masa masa;
    private Relleno relleno;
    private Cobertura cobertura;

    public Postre(String nombre, String tamano, int precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        this.masa = masa;
        this.relleno = relleno;
        this.cobertura = cobertura;
    }

    public abstract void preparar();

    public abstract void servir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
