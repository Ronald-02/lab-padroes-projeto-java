package one.digitalinnovation.gof.Facade;


public class ExemploFacade {
    public static void main(String[] args) {
        // Criando uma instância do Facade para o sistema de e-mail
        SistemaDeEmail sistemaDeEmail = new SistemaDeEmail();
        
        // Enviando uma mensagem por e-mail
        sistemaDeEmail.enviar("Olá, mundo!");
    }
}
