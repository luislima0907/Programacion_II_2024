package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Equipo {
    private String nombre;
    private String estado;
    private String tipo;

    public Equipo(String nombre, String estado, String tipo) {
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
    }

    public void encender(){
        String nombreDelEquipo = getNombre();
        System.out.println("Equipo" + nombreDelEquipo + " Encendido");
    }

    public void apagar(){
        System.out.println("Equipo " + getNombre() + " Apagado");
    }

    public void reparar(){
        System.out.println("Equipo " + getNombre() + " Reparado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
