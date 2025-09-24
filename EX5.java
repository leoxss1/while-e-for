// Leonardo Xavier Santana Santos
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, mediaAluno;
        int aprovados = 0, exames = 0, reprovados = 0;
        double somaMedias = 0;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.println("Aluno " + cont + ":");

            System.out.print("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();

            mediaAluno = (nota1 + nota2) / 2;
            somaMedias += mediaAluno;

            System.out.println("Média do aluno " + cont + ": " + String.format("%.2f", mediaAluno));

            if (mediaAluno <= 3) {
                System.out.println("Resultado: REPROVADO");
                reprovados++;
            } else if (mediaAluno < 6) {
                System.out.println("Resultado: EXAME");
                exames++;
            } else {
                System.out.println("Resultado: APROVADO");
                aprovados++;
            }

            System.out.println("----------------------------");
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("===== RELATÓRIO FINAL =====");
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exames);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.println("Média da classe: " + String.format("%.2f", mediaClasse));
    }
}
