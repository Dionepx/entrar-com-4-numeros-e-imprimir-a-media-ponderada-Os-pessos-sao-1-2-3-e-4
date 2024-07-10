import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 1a numero: ");
        double a = sc.nextDouble();

        System.out.println("Entre com 2a numero: ");
        double b = sc.nextDouble();

        System.out.println("Entre com 3a numero: ");
        double c = sc.nextDouble();

        System.out.println("Entre com 4a numero: ");
        double d = sc.nextDouble();

        double mp = (a*1 + b*2 + c*3 + d*4) / 10;
        System.out.println("Média ponderada: " + mp);
    }
}