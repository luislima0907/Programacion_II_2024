package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Pastel extends Postre{
    private String sabor;

    public Pastel(){

    }

    public Pastel(String nombre, String tamano, int precio, String sabor) {
        super(nombre, tamano, precio);
        this.sabor = sabor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pastel");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo pastel");
    }
}
