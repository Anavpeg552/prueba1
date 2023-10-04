import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tres numeros: ");
        int a= entrada.nextInt();
        int b= entrada.nextInt();
        int c= entrada.nextInt();
        entrada.close();

        double solucionA=a+b+c*(3-a)/(2*b);
        int solucionB=(2+(a*b)/4)^c+2;
        double solucionC=(-b+a);
        System.out.println("A: "+solucionA+" B: "+ solucionB+ " C: "+ solucionC);
    }
}
