package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private List<ObservadorEstoque> observadores;

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {

        if (novaQuantidade == quantidadeEstoque) {
            return;
        }

        int quantidadeAnterior = quantidadeEstoque;
        quantidadeEstoque = novaQuantidade;

        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(nome, quantidadeAnterior, novaQuantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}