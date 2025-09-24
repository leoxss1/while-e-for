// Leonardo xavier santana santos

import java.util.Scanner;
public class EX7{
    public static void main(String[] args) {
       int cont = 1;
     
        while (cont <= 10){
    
    Scanner leitor = new Scanner (System.in);
     System.out.println("INSIRA A ALTURA EM METROS: ( EX: 1,74) ");
     double altura = leitor.nextDouble();
      System.out.println("AGORA INSIRA O PESO: ( EX: 73 )");
     double peso = leitor.nextDouble();
    
     double imc = peso / (altura * altura);

    
    if(imc >= 18.5 && imc <= 24.9 ){
      
        System.out.printf(" SEM OBESIDADE %.2f.",imc);
          
    }
    
    cont++;
    if (cont <= 10) {
               
    System.out.println("\n insira mais uma vez o peso e altura");
}

}
}
}