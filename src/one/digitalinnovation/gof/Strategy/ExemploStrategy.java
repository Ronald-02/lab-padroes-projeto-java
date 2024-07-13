package one.digitalinnovation.gof.Strategy;


public class ExemploStrategy {
    public static void main(String[] args) {
        // Usando o método de pagamento com cartão de crédito
        MetodoDePagamento cartao = new PagamentoComCartao();
        Caixa caixa = new Caixa(cartao);
        caixa.realizarPagamento(50.0);

        // Mudando para o método de pagamento com dinheiro
        MetodoDePagamento dinheiro = new PagamentoComDinheiro();
        caixa.setMetodoDePagamento(dinheiro);
        caixa.realizarPagamento(30.0);
    }
}
