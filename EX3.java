// Leonardo xavier santana santos
import java.util.Scanner;
public class EX3{
    public static void main(String[] args) {
        Scanner leitor =new Scanner( System.in);
        System.out.println("digite um numero");
        int numerodig = leitor.nextInt();
        System.out.print("Sequência: ");
        for (int cont =1; cont <= numerodig;  cont++ ){
            System.out.print(cont + " ");

        }

    }
    
}
