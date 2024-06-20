import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
    Scanner sc = new 
      Scanner(System.in);
    System.out.println("digite seu primeiro nome:");
    String nome = sc.next();
    System.out.println("digite seu sobrenome:");
    String sobrenome = sc.next();
    System.out.println(" seu nome completo é:" + nome + " " + sobrenome);
  System.out.println("digite a sua idade:");
    int idade = sc.nextInt();
    System.out.println("####");
    System.out.println("digite a sua altura:");
    double altura = sc.nextDouble();
    System.out.println("####");
    System.out.println("digite a sua massa");
    double massa = sc.nextDouble();
    System.out.println("####");
    System.out.println("fórmula para calcular o IMC");
    System.out.println("IMC = massa/ altura*altura");
    double imc = massa / altura*altura;
    System.out.println("#####################################");
   System.out.println("nome)");
    System.out.println(nome + ("") + sobrenome);
 System.out.println(" ");
    System.out.println("altura: ");
    System.out.println(altura+"metros");
    System.out.println("");
    System.out.println("massa:");
    System.out.println(massa+"kg");
    System.out.println(" ");
    System.out.println("considere apenas o valor inteiro");
    System.out.println("seu IMC é:");
    System.out.println(imc);
    
  }

}