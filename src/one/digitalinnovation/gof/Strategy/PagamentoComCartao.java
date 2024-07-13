package one.digitalinnovation.gof.Strategy;

// Pagamento com cartão de crédito
public class PagamentoComCartao implements MetodoDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " com cartão de crédito.");
    }
}
