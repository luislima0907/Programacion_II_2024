package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class TransferenciaBancaria implements Pago{
    private String numeroDeCuenta;
    private String nombreDeUsuario;
    private String nombreDeBanco;

    public TransferenciaBancaria(String numeroDeCuenta, String nombreDeUsuario, String nombreDeBanco) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombreDeUsuario = nombreDeUsuario;
        this.nombreDeBanco = nombreDeBanco;
    }

    @Override
    public void Pagar() {
        if (getNumeroDeCuenta() == null || getNumeroDeCuenta().isEmpty()) {
            System.out.println("Por favor ingrese un numero de cuenta");
        } else if (getNombreDeUsuario() == null || getNombreDeUsuario().isEmpty()) {
            System.out.println("Por favor ingrese un nombre de usuario");
        } else if (getNombreDeBanco() == null || getNombreDeBanco().isEmpty()) {
            System.out.println("Por favor ingrese un nombre de banco");
        } else {
            System.out.println("Pago exitoso por transferencia bancaria");
        }
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getNombreDeBanco() {
        return nombreDeBanco;
    }
}
