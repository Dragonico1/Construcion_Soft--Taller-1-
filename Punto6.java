import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        float cali1 = 0, cali2 = 0, cali3 = 0, prom = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresela la calificacion #1 ");
        cali1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingresela la calificacion #2 ");
        cali2 = sc.nextFloat();
        sc.nextLine();
        
        System.out.println("Ingresela la calificacion #3 ");
        cali3 = sc.nextFloat();
        sc.nextLine();

        prom = (cali1 + cali2 + cali3)/3;

        System.out.println("El promedio es: " + prom);

    }
}
