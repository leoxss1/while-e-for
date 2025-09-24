// Leonardo xavier santana santos
import java.util.Scanner;
public class EX9 {
    public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);

        int codigo;
        int qtd;
        double totalCompra = 0;
        char continuar;

        do {
         
            System.out.println("------ CARDÁPIO ------");
            System.out.println("100 - Cachorro quente R$ 1,20");
            System.out.println("101 - Bauru Simples   R$ 1,30");
            System.out.println("102 - Bauru com ovo   R$ 1,50");
            System.out.println("103 - Hambúrguer      R$ 1,20");
            System.out.println("104 - Cheeseburguer   R$ 1,30");
            System.out.println("105 - Refrigerante    R$ 1,00");
            System.out.println("-----------------------");

            System.out.print("Digite o código do produto: ");
            codigo = leitor.nextInt();

            System.out.print("Digite a quantidade: ");
            qtd = leitor.nextInt();

            double preco = 0;
            String nomeProduto = "";

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    nomeProduto = "Cachorro quente";
                    break;
                case 101:
                    preco = 1.30;
                    nomeProduto = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    nomeProduto = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    nomeProduto = "Hambúrguer";
                    break;
                case 104:
                    preco = 1.30;
                    nomeProduto = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    nomeProduto = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido!");
                    preco = 0;
            }

            double subtotal = preco * qtd;
            totalCompra += subtotal;

            if (preco > 0) {
                System.out.println(qtd + " x " + nomeProduto + " = R$ " + String.format("%.2f", subtotal));
            }

            System.out.print("Deseja continuar comprando? (S/N): ");
            continuar = leitor.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("-----------------------");
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", totalCompra));
        System.out.println("Obrigado pela compra!");
    }
}
    

    

