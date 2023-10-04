import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tres numeros: ");
        double a= entrada.nextInt();
        double b= entrada.nextInt();
        int c= entrada.nextInt();
        entrada.close();

        double solucionA=a+b+c*(3-a)/(2*b);
        int solucionB=0;
        double solucionC=(-b+a);
        System.out.println("A: "+solucionA+" B: "+ solucionB+ " C: "+ solucionC);
    }
}
