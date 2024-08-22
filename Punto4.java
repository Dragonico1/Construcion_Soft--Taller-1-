import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float precio_producto,porcentaje_descuento;

        System.out.println("ingrese el precio original del producto :  ");
        precio_producto=sc.nextFloat();
        sc.nextLine();

        System.out.println("ingrese el descuento que desea realizar:  ");
        porcentaje_descuento=sc.nextFloat();
        sc.nextLine();
        
        float valor_descuento =  (porcentaje_descuento/100)*precio_producto;
        float valor_final= precio_producto- valor_descuento;

        System.out.println("El precio final del producto con el descuento es :  " + valor_final);
    }
}
