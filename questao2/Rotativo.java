package questao2;

public class Rotativo implements EstrategiaCobranca {

    private static final double VALOR_POR_HORA = 10.00;

    @Override
    public double calcularValor(int tempoPermanencia) {

        int horas = (int) Math.ceil(tempoPermanencia / 60.0);

        return horas * VALOR_POR_HORA;
    }
}