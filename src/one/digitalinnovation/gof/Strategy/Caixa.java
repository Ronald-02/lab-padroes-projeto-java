package one.digitalinnovation.gof.Strategy;

// Contexto para aplicar um método de pagamento
public class Caixa {
    private MetodoDePagamento metodoDePagamento;

    public Caixa(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void realizarPagamento(double valor) {
        metodoDePagamento.pagar(valor);
    }
}
