package one.digitalinnovation.gof.Singleton;

public class ExemploSingleton {
    public static void main(String[] args) {
        // Obtendo a única instância do Contador
        Contador contador1 = Contador.getInstancia();
        Contador contador2 = Contador.getInstancia();

        // Verificando se ambas as variáveis apontam para a mesma instância
        System.out.println(contador1 == contador2); // true

        // Usando a instância para aumentar e mostrar o valor do contador
        contador1.aumentar();
        contador1.aumentar();
        System.out.println("Valor do Contador: " + contador1.getValor()); // 2
    }
}
