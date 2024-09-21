package gt.edu.miumg.SegundoExamenParcialProgramacionII;

public class Paypal implements Pago{
    private String usuario;
    private String clave;
    private String aprobacionEnAPI;

    public Paypal(String usuario, String clave, String aprobacionEnAPI) {
        this.usuario = usuario;
        this.clave = clave;
        this.aprobacionEnAPI = aprobacionEnAPI;
    }

    @Override
    public void Pagar() {
        if (getUsuario() == null || getUsuario().isEmpty()){
            System.out.println("Usuario no encontrado");
        } else if (getClave() == null || getClave().isEmpty()) {
            System.out.println("Clave no encontrada");
        } else if (getAprobacionEnAPI() == null || getAprobacionEnAPI().isEmpty()) {
            System.out.println("Aprobacion en API no encontrada");
        } else {
            System.out.println("Pago con paypal exitoso");
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getAprobacionEnAPI() {
        return aprobacionEnAPI;
    }
}
