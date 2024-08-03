package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class SucursalNuevaYork extends Sucursal{

    public SucursalNuevaYork(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void agregarEmpleado() {
        Empleado fernan = new Empleado("Fernan", 5000, "Cocinero");
        Empleado marvin = new Empleado("Marvin", 3000, "mesero");
        System.out.println("Los empleados ingresados a esta sucursal son: " +
                "\n1. " + fernan.getNombre() +
                "\n2. " + marvin.getNombre());
    }

    @Override
    public void agregarIngrediente() {
        Masa masa = new Masa("masa", "de maiz", 100);
        Relleno relleno = new Relleno("rellleno dulce", "fresa", 20);
        Cobertura cobertura = new Cobertura("cobertura", 20, "dura");
        System.out.println("Se estan agregando los siguientes ingredientes:\n" +
                "1. " + masa.ObtenerNombre() +
                "\n2. " + relleno.ObtenerNombre() +
                "\n3. " + cobertura.ObtenerNombre());
    }

    @Override
    public void agregarEquipo() {
        Equipo equipo = new Equipo("ChesBrown", "activo", "para cocinar");
        System.out.println("El equipo ingresado es: " +
                "\n1. " + equipo.getNombre());
    }

    @Override
    public void agregarEspecialidad() {
        Cheesecake cheesecake = new Cheesecake("chess", "grande", 10, "queso italiano");
        Brownie brownie = new Brownie("brownie", "pequeno", 20, "especial");
        System.out.println("Las especialidades de esta sucursal son: "
        + "\n1. " + cheesecake.getNombre()
        + "\n2. " + brownie.getNombre());
    }
}
