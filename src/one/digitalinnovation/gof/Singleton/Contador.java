package one.digitalinnovation.gof.Singleton;

// A classe Contador segue o padrão Singleton para garantir que haja apenas uma instância dela.
public class Contador {

    // Instância única e privada da classe
    private static Contador instancia;

    // Contador interno
    private int valor;

    // Construtor privado para evitar criação de novas instâncias fora da classe
    private Contador() {
        valor = 0;
    }

    // Método público e estático para acessar a instância única da classe
    public static Contador getInstancia() {
        if (instancia == null) {
            instancia = new Contador();
        }
        return instancia;
    }

    // Método para aumentar o valor do contador
    public void aumentar() {
        valor++;
    }

    // Método para obter o valor do contador
    public int getValor() {
        return valor;
    }
}
