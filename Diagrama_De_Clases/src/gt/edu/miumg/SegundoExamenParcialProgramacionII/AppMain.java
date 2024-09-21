package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class AppMain {
    public static void main(String[] args) {
        // Creamos los metodos De pago
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("3312145",
                "marzo 2030",
                "566",
                "autorizado desde banrural");
        Paypal paypal = new Paypal("Luis",
                "5582",
                "autorizado desde azteca");
        CriptoMoneda criptoMoneda = new CriptoMoneda("Maker");
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria("9012392",
                "Fernando", "GT Continental");

        // Por medio del constructor pasamos el metodo de pago que nosotros queramos hacer
        MetodosDePago metodosDePago = new MetodosDePago(transferenciaBancaria);
    }
}
