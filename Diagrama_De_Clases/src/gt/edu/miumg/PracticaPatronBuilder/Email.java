package gt.edu.miumg.PracticaPatronBuilder;

import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<String> adjuntos;

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public List<String> getAdjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(List<String> adjuntos) {
        this.adjuntos = adjuntos;
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    @Override
    public String toString() {
        return "EMAIL" +
                "\nDestinatarios: " + destinatarios +
                "\nAsunto: '" + asunto + '\'' +
                "\nCuerpo: '" + cuerpo + '\'' +
                "\nAdjuntos: " + adjuntos;
    }
}
