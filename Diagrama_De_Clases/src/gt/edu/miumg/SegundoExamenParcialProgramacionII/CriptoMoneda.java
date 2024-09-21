package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class CriptoMoneda implements Pago{
    private String redDeBlockchain;

    public CriptoMoneda(String redDeBlockchain) {
        this.redDeBlockchain = redDeBlockchain;
    }
    public String getRedDeBlockchain() {
        return redDeBlockchain;
    }

    @Override
    public void Pagar() {
        if (getRedDeBlockchain() == null || getRedDeBlockchain().isEmpty()) {
            System.out.println("Ingrese una red de blockchain");
        } else {
            System.out.println("Pago exitoso con Criptomoneda");
        }
    }
}
