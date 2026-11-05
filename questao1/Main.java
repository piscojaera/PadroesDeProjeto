package questao1;

public class Main {

    public static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        notebook.alterarQuantidade(4);
        notebook.alterarQuantidade(0);
        notebook.alterarQuantidade(8);
        notebook.alterarQuantidade(8);

        notebook.removerObservador(compras);

        System.out.println("\n--- Compras removida ---\n");

        notebook.alterarQuantidade(3);
        notebook.alterarQuantidade(0);
        notebook.alterarQuantidade(6);
    }
}