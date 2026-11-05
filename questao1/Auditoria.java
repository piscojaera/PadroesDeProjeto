package questao1;

public class Auditoria implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {

        System.out.println("AUDITORIA: " + nomeProduto
                + " | Estoque anterior: " + quantidadeAnterior
                + " | Novo estoque: " + novaQuantidade);
    }
}