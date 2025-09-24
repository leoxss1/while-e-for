// Leonardo Xavier Santana Santos
import java.util.Scanner;
public class EX6{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.print("Eleitor " + cont + " - Digite seu voto (1-4 candidato, 5 nulo, 6 branco): ");
            int voto = leitor.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Voto inválido! Não será contabilizado.");
            }
        }

        int totalVotos = candidato1 + candidato2 + candidato3 + candidato4 + nulos + brancos;
        double percentualNulos = (nulos * 100.0) / totalVotos;
        double percentualBrancos = (brancos * 100.0) / totalVotos;
        System.out.println("===== RESULTADO FINAL =====");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);
        System.out.println("Percentual de votos nulos: " + String.format("%.2f", percentualNulos) + "%");
        System.out.println("Percentual de votos em branco: " + String.format("%.2f", percentualBrancos) + "%");
    }
}