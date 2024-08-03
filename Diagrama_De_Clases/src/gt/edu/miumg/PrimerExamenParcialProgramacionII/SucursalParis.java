package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class SucursalParis extends Sucursal{

    @Override
    public void agregarEmpleado() {
        Empleado celeste = new Empleado("Celeste", 5000, "Cocinera");
        Empleado lucia = new Empleado("Lucia", 3000, "mesera");
        System.out.println("Los empleados ingresados a esta sucursal son: " +
                "\n1. " + celeste.getNombre() +
                "\n2. " + lucia.getNombre());
    }

    @Override
    public void agregarIngrediente() {
        Masa masa = new Masa("masa", "de maiz", 200);
        Relleno relleno = new Relleno("rellleno dulce", "fresa", 40);
        Cobertura cobertura = new Cobertura("cobertura", 50, "suave");
        System.out.println("Se estan agregando los siguientes ingredientes:\n" +
                "1. " + masa.ObtenerNombre() +
                "\n2. " + relleno.ObtenerNombre() +
                "\n3. " + cobertura.ObtenerNombre());
    }

    @Override
    public void agregarEquipo() {
        Equipo equipo = new Equipo("Pastrepa", "activo", "para cocinar");
        System.out.println("El equipo ingresado es: " +
                "\n1. " + equipo.getNombre());
    }

    @Override
    public void agregarEspecialidad() {
        Crepa crepa = new Crepa("Crepa", "mediana", 20, "suave");
        Pastel pastel = new Pastel("pastel", "grande", 30, "Fresa");
        System.out.println("Las especialidades de esta sucursal son: " +
                "\n1. " + crepa.getNombre() +
        "\n2. " + pastel.getNombre());
    }
}
