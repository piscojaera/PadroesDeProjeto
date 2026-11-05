package questao2;

public class Conveniado implements EstrategiaCobranca {

    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_POR_HORA = 10.00;
    private static final double DESCONTO = 0.20;

    @Override
    public double calcularValor(int tempoPermanencia) {

        int minutosCobrados = Math.max(0, tempoPermanencia - MINUTOS_GRATUITOS);

        int horas = (int) Math.ceil(minutosCobrados / 60.0);

        return horas * VALOR_POR_HORA * (1 - DESCONTO);
    }
}