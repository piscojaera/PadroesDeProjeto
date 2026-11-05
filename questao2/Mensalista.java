package questao2;

public class Mensalista implements EstrategiaCobranca {

    private static final double VALOR_FIXO = 200.00;

    @Override
    public double calcularValor(int tempoPermanencia) {
        return VALOR_FIXO;
    }
}