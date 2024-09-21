package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class TarjetaDeCredito implements Pago{
    private String numeroDeValidacion;
    private String fechaDeExpiracion;
    private String cvv;
    private String autorizacionBancaria;

    public TarjetaDeCredito(String numeroDeValidacion, String fechaDeExpiracion, String cvv, String autorizacionBancaria) {
        this.numeroDeValidacion = numeroDeValidacion;
        this.fechaDeExpiracion = fechaDeExpiracion;
        this.cvv = cvv;
        this.autorizacionBancaria = autorizacionBancaria;
    }


    @Override
    public void Pagar() {
        if (getNumeroDeValidacion() == null || getNumeroDeValidacion().isEmpty()) {
            System.out.println("Por favor ingrese un numero");
        } else if (getFechaDeExpiracion() == null || getFechaDeExpiracion().isEmpty()) {
            System.out.println("Por favor ingrese la fecha de expiracion");
        } else if (getCvv() == null || getCvv().isEmpty()) {
            System.out.println("Por favor ingrese la cvv de la tarjeta");
        } else if (getAutorizacionBancaria() == null || getAutorizacionBancaria().isEmpty()) {
            System.out.println("Por favor ingrese la autorizacion bancaria");
        } else {
            System.out.println("Pago con exito");
        }
    }

    public String getAutorizacionBancaria() {
        return autorizacionBancaria;
    }

    public String getCvv() {
        return cvv;
    }

    public String getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public String getNumeroDeValidacion() {
        return numeroDeValidacion;
    }
}
