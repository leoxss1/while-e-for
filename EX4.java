// Leonardo xavier santana santos
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
          Scanner leitor= new Scanner(System.in);
         
          int idade;
        double altura;
        double somaAlturas = 0;
        int contador = 0;

        for ( int cont = 1; cont <= 10; cont++ ){
            System.out.println("insira sua idade");
             idade = leitor.nextInt();
            System.out.println("agora insira sua altura ( EX 1,74)");
             altura = leitor.nextDouble();
   if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + String.format("%.2f", media));
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi cadastrada.");
         }

 }
}

  
