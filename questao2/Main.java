package questao2;

public class Main {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("ABC1D23", 90, new Rotativo());

        System.out.println("Placa: " + ticket.getPlaca());
        System.out.println("Tempo de permanência: " + ticket.getTempoPermanencia() + " minutos");

        System.out.printf("\nRotativo: R$ %.2f%n", ticket.calcularValor());

        ticket.alterarEstrategia(new Mensalista());

        System.out.printf("Mensalista: R$ %.2f%n", ticket.calcularValor());

        ticket.alterarEstrategia(new Conveniado());

        System.out.printf("Conveniado: R$ %.2f%n", ticket.calcularValor());
    }
}