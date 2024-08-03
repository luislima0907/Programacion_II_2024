package gt.edu.miumg.PrimerExamenParcialProgramacionII;

public class Cheesecake extends Postre{
    private String tipoDeQueso;

    public Cheesecake(String nombre, String tamano, int precio, String tipoDeQueso, Masa masa, Relleno relleno, Cobertura cobertura){
        super(nombre,tamano,precio,masa,relleno,cobertura);
        this.tipoDeQueso = tipoDeQueso;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cheesecake");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Cheesecake");
    }
}
