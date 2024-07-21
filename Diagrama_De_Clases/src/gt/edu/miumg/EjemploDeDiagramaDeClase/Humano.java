package gt.edu.miumg.EjemploDeDiagramaDeClase;

public class Humano extends Personaje implements IHeroe {
    public String genero;

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }

    public Humano(String nombre, String genero, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.genero = genero;
    }

    public void respirar() {
        System.out.println("Respirando");
    }

    @Override
    public void MostrarVida() {
        System.out.println("La vida de " + this.getNombre() + " es " + this.getVida());
    }

    @Override
    public void Desplazarse() {
        System.out.println(this.getNombre() + " se esta desplazando");
    }

    @Override
    public void MostrarPoder() {
        System.out.println(this.getNombre() + " tiene un poder de: " + this.getPoder());
    }
}
