package one.digitalinnovation.gof.Strategy;

// Pagamento com dinheiro
public class PagamentoComDinheiro implements MetodoDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " com dinheiro.");
    }
}
