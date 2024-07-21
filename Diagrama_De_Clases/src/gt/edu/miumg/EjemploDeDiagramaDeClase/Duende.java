package gt.edu.miumg.EjemploDeDiagramaDeClase;

public class Duende extends Personaje implements IVillano{
    public String habitat;

    @Override
    public void destruir() {

    }

    @Override
    public void atacar() {

    }

    public Duende(String nombre, String habitat, String descripcion, long tamaño, int poder, int vida) {
        super(nombre,descripcion,tamaño,poder,vida);
        this.habitat = habitat;
    }

    public void Esconderce() {

    }

    @Override
    public void Desplazarse() {
        System.out.println(this.getNombre() + " se esta desplazando");
    }

    @Override
    public void MostrarVida() {
        System.out.println(this.getNombre() + " tiene: " + this.getVida() + " puntos de salud");
    }

    @Override
    public void MostrarPoder() {
        System.out.println(this.getNombre() + " tiene: " + this.getPoder() + " puntos de poder");
    }
}
