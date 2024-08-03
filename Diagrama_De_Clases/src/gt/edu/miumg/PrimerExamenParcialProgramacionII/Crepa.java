package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Crepa extends Postre{
    private String tipoDeMasa;
    private double cantidad;

    public Crepa(String nombre, String tamano, int precio, String tipoDeMasa) {
        super(nombre, tamano, precio);
        this.tipoDeMasa = tipoDeMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Crepa");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo crepa");
    }
}
