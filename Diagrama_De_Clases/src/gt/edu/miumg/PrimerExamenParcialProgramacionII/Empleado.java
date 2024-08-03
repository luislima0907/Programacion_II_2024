package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Empleado {
    private String nombre;
    private int sueldo;
    private String puesto;

    public Empleado(String nombre, int sueldo, String puesto) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public void trabajar(){
        System.out.println("El empleado "+ getNombre() +" esta preparando tu pedido.");
    }

    public void tomarOrden(){
        System.out.println("El empleado "+ getNombre() +" esta tomando la orden.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
