// Leonardo xavier santana santos
import java.util.Scanner;
public class EX6{
    public static void main(String[] args) {
       Scanner leitor= new Scanner(System.in);
       System.out.println("insira 10 numeros inteiros e positivos");
       int menornum = leitor. nextInt();
       int cont = 1;
        while (cont <= 10) {
             System.out.println("num:");
               int numeros = leitor.nextInt();
            if (  numeros < menornum){
                menornum = numeros;
            }cont++;
            
        }System.out.println(" o menor numero é: " + menornum);
    }
    
}

