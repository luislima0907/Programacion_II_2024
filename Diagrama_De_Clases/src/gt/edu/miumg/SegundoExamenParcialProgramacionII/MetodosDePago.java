package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class MetodosDePago {
    private Pago pago;

    public MetodosDePago(Pago metodoDePago){
        this.pago = metodoDePago;
        this.pago.Pagar();
    }
}
