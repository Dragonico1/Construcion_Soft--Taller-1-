import java.util.Scanner;
public class Punto2{
    public static void main(String[] args) {
        int ano = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el año");
        ano = sc.nextInt();
        sc.nextLine();

        if (((ano % 4) == 0) && ((ano % 100) != 0) || ((ano % 400) == 0)){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
        
    }


}