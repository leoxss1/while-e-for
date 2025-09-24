// Leonardo Xavier Santana Santos
import java.util.Scanner;
public class EX7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maisDe50 = 0;
        double somaAlturas10a20 = 0;
        int cont10a20 = 0;
        int pesoMenor40 = 0;

    
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Pessoa " + cont + ":");

            System.out.print("Idade: ");
            int idade = leitor.nextInt();

            System.out.print("Altura (em metros, ex: 1,75): ");
            double altura = leitor.nextDouble();

            System.out.print("Peso (em kg): ");
            double peso = leitor.nextDouble();

       
            if (idade > 50) {
                maisDe50++;
            }

            
            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                cont10a20++;
            }

           
            if (peso < 40) {
                pesoMenor40++;
            }

            System.out.println("---------------------------");
        }

        
        double mediaAlturas = 0;
        if (cont10a20 > 0) {
            mediaAlturas = somaAlturas10a20 / cont10a20;
        }

      
        double porcentagemPesoMenor40 = (pesoMenor40 * 100.0) / 10;

    
        System.out.println("===== RESULTADOS =====");
        System.out.println("a) Quantidade de pessoas com mais de 50 anos: " + maisDe50);

        if (cont10a20 > 0) {
            System.out.println("b) Média das alturas das pessoas entre 10 e 20 anos: " 
                               + String.format("%.2f", mediaAlturas) + " m");
        } else {
            System.out.println("b) Não houve pessoas entre 10 e 20 anos.");
        }

        System.out.println("c) Porcentagem de pessoas com peso inferior a 40kg: " 
                           + String.format("%.2f", porcentagemPesoMenor40) + "%");
    }
}
