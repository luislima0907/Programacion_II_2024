package gt.edu.miumg.EjemploDeDiagramaDeClase;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPoder() {
        return poder;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Personaje(String nombre, String descripcion, long tamaño, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.vida = vida;
        this.tamaño = tamaño;
    }

    public  abstract void Desplazarse();

    public abstract void MostrarVida();

    public abstract void MostrarPoder();
}
