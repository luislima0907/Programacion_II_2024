package gt.edu.miumg.PracticaDeDOO;

import gt.edu.miumg.PracticaDeDOO.Cafe.CafeColombiano;
import gt.edu.miumg.PracticaDeDOO.Cafe.CafeEspressoItaliano;
import gt.edu.miumg.PracticaDeDOO.Sucursal.Empleado;
import gt.edu.miumg.PracticaDeDOO.Sucursal.Equipo;
import gt.edu.miumg.PracticaDeDOO.Sucursal.SucursalBogota;
import gt.edu.miumg.PracticaDeDOO.Sucursal.SucursalRoma;

import java.util.Scanner;

public class PruebaDeDOO {
    public static void main(String[] args) {
        // Hacemos una condicional switch para probar hacer un cafe en cualquiera de las dos sucursales
        Scanner sc = new Scanner(System.in);
        System.out.println("Puedes elegir cualquiera de las siguientes opciones:\n" +
                "1. Hacer las tareas de la sucursal de Bogota.\n" +
                "2. Hacer las tareas de la sucursal de Roma");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                sucursalBogota();
                break;
            case "2":
                sucursalRoma();
                break;
        }
        System.out.println("Gracias por usar mi programa!!!");
    }

    public static void sucursalBogota() {
        // creamos una sucursal de bogota y esta se especializa en cafe colombiano
        SucursalBogota sucursalBogota = new SucursalBogota("Cafegota","Bogota", "29428503");
        String nombreDeLaSucursal = SucursalBogota.getNombre();
        String direccionDeLaSucursal = sucursalBogota.getDireccion();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la Sucursal " + nombreDeLaSucursal + " ubicada en " + direccionDeLaSucursal);
        sucursalBogota.agregarEspecialidad();
        System.out.println("--------------------------------------------------------------------------------");
        sucursalBogota.agregarIngrediente();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ahora prepararemos el pedido de un cliente!!!");
        System.out.println("--------------------------------------------------------------------------------");

        // creamos un empleado que tenga el puesto de mesero para tomar la orden y lo agregamos
        // a la sucursal que creamos
        Empleado marvin = new Empleado("Marvin", "mesero", 1000);
        Empleado empleadoMarvin = sucursalBogota.agregarEmpleado(marvin);
        empleadoMarvin.TomarOrden(marvin);
        System.out.println("--------------------------------------------------------------------------------");

        // Creamos un empleado que tenga el puesto de cocinero para hacer el pedido del cliente
        // y tambien lo agregamos a la sucursal
        Empleado fernan = new Empleado("Fernan", "cocinero", 3000);
        Empleado empleadoFernan = sucursalBogota.agregarEmpleado(fernan);

        // Preparamos los ingredientes para realizar el pedido
        empleadoFernan.Trabajar(fernan);
        System.out.println("--------------------------------------------------------------------------------");
        CafeColombiano cafeColombiano = new CafeColombiano("Cafe a la colombia","taza mediana","Molido", 10);
        cafeColombiano.Preparar(cafeColombiano);
        System.out.println("--------------------------------------------------------------------------------");

        // Una vez tengamos listos los ingredientes para hacer el pedido, procedemos a encender
        // el equipo para preparar el cafe, y una vez terminado lo apagamos
        Equipo cafetera = new Equipo("French press", "Activa");
        Equipo frenchPress = sucursalBogota.agregarEquipo(cafetera);
        frenchPress.encenderEquipo();
        System.out.println("--------------------------------------------------------------------------------");
        frenchPress.apagarEquipo();
        System.out.println("--------------------------------------------------------------------------------");

        // de ultimo procedemos a servir el pedido al cliente
        cafeColombiano.Servir(cafeColombiano);
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void sucursalRoma(){
        // creamos una sucursal de roma y esta se especializa en cafe espresso italiano
        SucursalRoma sucursalRoma = new SucursalRoma("Romafe","Roma", "de 7 a 9");
        String nombreDeLaSucursal = SucursalRoma.getNombre();
        String direccionDeLaSucursal = sucursalRoma.getDireccion();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la Sucursal " + nombreDeLaSucursal + " ubicada en " + direccionDeLaSucursal);
        sucursalRoma.agregarEspecialidad();
        System.out.println("--------------------------------------------------------------------------------");
        sucursalRoma.agregarIngrediente();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ahora prepararemos el pedido de un cliente!!!");
        System.out.println("--------------------------------------------------------------------------------");

        // creamos un empleado que tenga el puesto de mesero para tomar la orden y lo agregamos
        // a la sucursal que creamos
        Empleado jose = new Empleado("Jose", "mesero", 1000);
        Empleado empleadoJose = sucursalRoma.agregarEmpleado(jose);
        empleadoJose.TomarOrden(jose);
        System.out.println("--------------------------------------------------------------------------------");

        // Creamos un empleado que tenga el puesto de cocinero para hacer el pedido del cliente
        // y tambien lo agregamos a la sucursal
        Empleado fredy = new Empleado("Fredy", "cocinero", 3000);
        Empleado empleadoFredy = sucursalRoma.agregarEmpleado(fredy);

        // Preparamos los ingredientes para realizar el pedido
        empleadoFredy.Trabajar(fredy);
        System.out.println("--------------------------------------------------------------------------------");
        CafeEspressoItaliano cafeEspressoItaliano = new CafeEspressoItaliano("Cafe a la Roma","taza mediana",8, 15);
        cafeEspressoItaliano.Preparar(cafeEspressoItaliano);
        System.out.println("--------------------------------------------------------------------------------");

        // Una vez tengamos listos los ingredientes para hacer el pedido, procedemos a encender
        // el equipo para preparar el cafe, y una vez terminado lo apagamos
        Equipo cafetera = new Equipo("Aeropress", "Activa");
        Equipo Aeropress = sucursalRoma.agregarEquipo(cafetera);
        Aeropress.encenderEquipo();
        System.out.println("--------------------------------------------------------------------------------");
        Aeropress.apagarEquipo();
        System.out.println("--------------------------------------------------------------------------------");

        // de ultimo procedemos a servir el pedido al cliente
        cafeEspressoItaliano.Servir(cafeEspressoItaliano);
        System.out.println("--------------------------------------------------------------------------------");
    }
}
