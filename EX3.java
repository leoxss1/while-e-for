// Leonardo xavier santana santos

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("insira um numero inteiro:");
        int limite = leitor.nextInt();
        int valor = 1;
        while (valor <= limite) {
            System.out.print(valor + " ");
            valor = valor * 2;
            
        }
        

    }
    
}
