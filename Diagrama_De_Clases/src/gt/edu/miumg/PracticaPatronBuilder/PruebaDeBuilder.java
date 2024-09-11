package gt.edu.miumg.PracticaPatronBuilder;

public class PruebaDeBuilder {
    public static void main(String[] args) {
        Email email = Email.builder()
                // Poner mas de un destinatario separado por ','
                .destinatarios("Luis,Carranza")
                .asunto("Hola mundo")
                .cuerpo("Mira el archivo")
                // Poner mas de un archivo adjunto separado por ','
                .adjuntos("parcialUnoProgra.pdf,parcialDosCalculo.pdf")
                .build();
        System.out.println(email.toString());
    }
}
