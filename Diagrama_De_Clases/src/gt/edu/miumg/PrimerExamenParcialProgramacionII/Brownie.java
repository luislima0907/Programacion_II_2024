package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Brownie extends Postre{
    private String tipoDeChocolate;

    public Brownie(String nombre, String tamano, int precio, String tipoDeChocolate) {
        super(nombre, tamano, precio);
        this.tipoDeChocolate = tipoDeChocolate;
    }


    @Override
    public void preparar() {
        System.out.println("Preparando Brownie");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo el Brownie");
    }
}
