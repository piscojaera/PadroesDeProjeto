package questao3;

public class Main {

    public static void main(String[] args) {

        Bebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        pedido1 = new Chantilly(pedido1);

        Bebida pedido2 = new Cha();
        pedido2 = new Calda(pedido2);

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Calda(pedido3);

        System.out.println("PEDIDO 1");
        System.out.println("Descricao: " + pedido1.getDescricao());
        System.out.printf("Preco: R$ %.2f%n%n", pedido1.getPreco());

        System.out.println("PEDIDO 2");
        System.out.println("Descricao: " + pedido2.getDescricao());
        System.out.printf("Preco: R$ %.2f%n%n", pedido2.getPreco());

        System.out.println("PEDIDO 3");
        System.out.println("Descricao: " + pedido3.getDescricao());
        System.out.printf("Preco: R$ %.2f%n", pedido3.getPreco());
    }
}