package gt.edu.miumg.EjemploDeDiagramaDeClase;

public class Elfo extends Personaje implements IHeroe {
    public String TipoDeMagia;
    @Override
    public void recibirAtaque() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }
    public Elfo(String nombre, String tipoDeMagia, String descripcion, long tamaño, int poder, int vida) {
        super(nombre,descripcion,tamaño,poder,vida);
        this.TipoDeMagia = tipoDeMagia;
    }

    public void Invocar() {

    }

    @Override
    public void MostrarVida() {
        System.out.println(this.getNombre() + "tiene: " + getVida() + "Puntos de salud");
    }

    @Override
    public void Desplazarse() {
        System.out.println(this.getNombre() + "se esta desplazando");
    }

    @Override
    public void MostrarPoder() {
        System.out.println(this.getNombre() + "tiene: " + getPoder() + "Puntos de poder");
    }
}
