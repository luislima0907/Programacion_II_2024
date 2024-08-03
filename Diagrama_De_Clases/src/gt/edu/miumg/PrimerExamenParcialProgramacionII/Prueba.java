package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Prueba {
    public static void main(String[] args) {
        // PRUEBA DE PARIS
        SucursalParis paris = new SucursalParis("parispostres", "Paris");
        paris.agregarEspecialidad();
        paris.agregarEmpleado();
        paris.agregarEquipo();
        paris.agregarIngrediente();
        Crepa crepa = new Crepa();
        crepa.preparar();
        crepa.servir();

        // PRUEBA DE NUEVA YORK
        SucursalNuevaYork nuevaYork = new SucursalNuevaYork("nueva york press", "Nueva York");
        nuevaYork.agregarEspecialidad();
        nuevaYork.agregarEmpleado();
        nuevaYork.agregarEquipo();
        nuevaYork.agregarIngrediente();
        Cheesecake cheesecake = new Cheesecake();
        cheesecake.preparar();
        cheesecake.servir();
    }
}
