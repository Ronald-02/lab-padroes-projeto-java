package one.digitalinnovation.gof.Facade;

// Subsistema para enviar um e-mail
public class EnviadorDeEmail {
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
}
