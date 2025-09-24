// Leonardo xavier santana santos
import java.util.Scanner;

public class EX8{
   public static void main (String[] args){
    Scanner leitor = new Scanner (System.in);
   int cont = 1;
    double  media;
    double nota1;
    double nota2;

    do{
    do{
    System.out.println("insira sua primeira nota:");
     nota1= leitor.nextDouble();
    }while (nota1 < 0 || nota1 > 10);

      do { 
        System.out.println("insira sua segunda nota:");
     nota2= leitor.nextDouble();
   
   }while (nota2 < 0 || nota2 > 10);

   media = (nota1 + nota2) /2.0;
  System.out.println("media é " + media);
 
      cont++; 
       
if (cont <= 5) {
                System.out.println("Próximo aluno\n");

}
}while (cont <= 5);
  
  

   
}
}

