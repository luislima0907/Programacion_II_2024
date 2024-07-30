package gt.edu.miumg.PracticaDeDOO.Cafe;

import gt.edu.miumg.PracticaDeDOO.Ingredientes.Agua;
import gt.edu.miumg.PracticaDeDOO.Ingredientes.Azucar;
import gt.edu.miumg.PracticaDeDOO.Ingredientes.Grano;
import gt.edu.miumg.PracticaDeDOO.Ingredientes.Leche;

public abstract class Cafe {

    private String nombre;
    private String tamano;
    private int precio;
    protected Agua agua;
    protected Grano grano;
    protected Azucar azucar;
    protected Leche leche;

    public Cafe(String nombre, String tamano, int precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public Agua setAgua(Agua agua) {
        return this.agua = agua;
    }

    public Agua getAgua() {
        return agua;
    }

    public Grano setGrano(Grano grano) {
        return this.grano = grano;
    }

    public Grano getGrano() {
        return grano;
    }

    public Azucar setAzucar(Azucar azucar) {
        return this.azucar = azucar;
    }

    public Azucar getAzucar() {
        return azucar;
    }

    public Leche setLeche(Leche leche) {
        return this.leche = leche;
    }

    public Leche getLeche() {
        return leche;
    }

    public abstract Object Preparar(Object cafe);
    public abstract Object Servir(Object cafe);
}