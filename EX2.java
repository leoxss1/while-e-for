// Leonardo xavier santana santos
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System .in);
       System.out.println("insira 10 numeros inteiros");
      int contador = 1; 
        while (contador <= 10) {
            int num = leitor.nextInt();
            if(num %2 == 0){
                System.out.println(num + " é par");
            }else{
                System.out.println(num + " é impar");
            }contador++;
    }

}
}
