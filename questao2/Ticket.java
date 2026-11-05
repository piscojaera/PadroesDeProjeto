package questao2;

import java.util.Objects;

public class Ticket {

    private String placa;
    private int tempoPermanencia;
    private EstrategiaCobranca estrategia;

    public Ticket(String placa, int tempoPermanencia, EstrategiaCobranca estrategia) {

        if (tempoPermanencia < 0) {
            throw new IllegalArgumentException("O tempo não pode ser negativo.");
        }

        this.placa = placa;
        this.tempoPermanencia = tempoPermanencia;
        this.estrategia = Objects.requireNonNull(estrategia);
    }

    public void alterarEstrategia(EstrategiaCobranca estrategia) {
        this.estrategia = Objects.requireNonNull(estrategia);
    }

    public double calcularValor() {
        return estrategia.calcularValor(tempoPermanencia);
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoPermanencia() {
        return tempoPermanencia;
    }
}