import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tres numeros: ");
        double a= entrada.nextInt();
        double b= entrada.nextInt();
        double c= entrada.nextInt();
        entrada.close();

        double solucionA=a+b+c*(3-a)/(2*b);
        double solucionB= Math.pow((2+a*b)/4,c+2);
        double solucionC=((-b+ Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
        System.out.println("A:"+solucionA+" B:"+ solucionB+ " C:"+ solucionC);
    }
}
