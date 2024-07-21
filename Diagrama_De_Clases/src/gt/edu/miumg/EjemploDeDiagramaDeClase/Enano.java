package gt.edu.miumg.EjemploDeDiagramaDeClase;

public class Enano extends Personaje implements IHeroe{
    public int VidaDeLaArmdura;

    @Override
    public void defender() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void recibirAtaque() {

    }

    public Enano(String nombre, String descripcion, long tamaño, int poder, int vida, int vidaDeLaArmdura) {
        super(nombre,descripcion,tamaño,poder,vida);
        this.VidaDeLaArmdura = vidaDeLaArmdura;
    }

    public void hablar() {

    }

    @Override
    public void MostrarPoder() {
        System.out.println(this.getNombre() + " tiene un poder de: " + this.getPoder());
    }

    @Override
    public void Desplazarse() {
        System.out.println(this.getNombre() + " se esta desplazando");
    }

    @Override
    public void MostrarVida() {
        System.out.println(this.getNombre() + " tiene un vida de: " + this.getVida());
    }
}
