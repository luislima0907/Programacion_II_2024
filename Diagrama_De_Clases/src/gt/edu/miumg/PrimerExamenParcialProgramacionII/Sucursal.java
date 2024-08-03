package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public abstract class Sucursal {
    private String nombre;
    private String direccion;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public abstract void agregarEmpleado();

    public abstract void agregarIngrediente();

    public abstract void agregarEquipo();

    public abstract void agregarEspecialidad();
}
