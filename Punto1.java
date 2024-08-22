 import java.util.Scanner;
 public class Punto1{

     public static void main(String[] args) {
        float lado1 = 0, lado2 = 0, lado3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Los lados del triangulo deben de ser positivos");
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingrese el  lado 2 del triangulo");
        lado2 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingrese el lado 3 del triangulo");
        lado3 = sc.nextFloat();
        sc.nextLine();
         
        if((lado1 >= 0) && (lado2 >=0) && (lado3 >=0)){
            if((lado1 == lado2) && (lado1 == lado3)){
            System.out.println("Es un triangulo equilatero");
            }else{
                if((lado2 == lado3) || (lado2 == lado1) || (lado1 == lado3)){
                     System.out.println("Es un triangulo isoseles");
                }else{
                    System.out.println("El triangulo es escaleno");
                }
            }
         }else{
            System.out.println("Los lados del triangulo deben de ser positivos");
        }
           
    }
}
 