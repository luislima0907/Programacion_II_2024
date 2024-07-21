package gt.edu.miumg.EjemploDeDiagramaDeClase;

public class Ogro extends Personaje implements IVillano {
    public String raza;

    @Override
    public void atacar() {

    }

    @Override
    public void destruir() {

    }
    public Ogro(String nombre, String raza, String descripcion, long tamaño, int vida, int poder, int edad) {
        super(nombre,descripcion,tamaño,poder,vida);
        this.raza = raza;
    }

    public void Comer() {

    }

    @Override
    public void MostrarPoder() {
        System.out.println(this.getNombre() + " tiene: " + getPoder() + " puntos de poder");
    }

    @Override
    public void Desplazarse() {
        System.out.println(this.getNombre() + " se esta desplazando");
    }

    @Override
    public void MostrarVida() {
        System.out.println(this.getNombre() + " tiene: " + getVida() + " puntos de vida");
    }
}
