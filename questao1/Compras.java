package questao1;

public class Compras implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {

        if (novaQuantidade < 5) {
            System.out.println("COMPRAS: Estoque baixo de " + nomeProduto
                    + ". Quantidade atual: " + novaQuantidade);
        }
    }
}