import java.util.Scanner;
public class Punto3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float num1,num2,num3,menor,mitad,mayor;

        System.out.println("ingrese el primer numero.");
        num1=sc.nextFloat();
        sc.nextLine();

        System.out.println("ingrese el segundo numero.");
        num2=sc.nextFloat();
        sc.nextLine();

        System.out.println("ingrese el primer numero.");
        num3=sc.nextFloat();
        sc.nextLine();


        if( num1>num2 && num1>num3){
            mayor=num1;
        }else if(num2>num1 && num2>num3){
            mayor=num2;
        } else{
        mayor=num3;
        }
        
        if( num1<num2 && num1<num3){
            menor=num1;
        }else if(num2<num1 && num2<num3){
            menor=num2;
        } else{
        menor=num3;
        }

        mitad=(num1+num2+num3)-(mayor+menor);

        System.out.printf("El orden de los números de forma ascendente es: %.2f, %.2f, %.2f%n", menor, mitad, mayor);
    }
}
