package one.digitalinnovation.gof.Facade;

// Facade para simplificar o envio de e-mails
public class SistemaDeEmail {
    private final ConectorDeEmail conector;
    private final EnviadorDeEmail enviador;

    public SistemaDeEmail() {
        this.conector = new ConectorDeEmail();
        this.enviador = new EnviadorDeEmail();
    }

    public void enviar(String mensagem) {
        conector.conectar();
        enviador.enviarEmail(mensagem);
    }
}
