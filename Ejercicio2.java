import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce los grados: ");
        double G= entrada.nextDouble();
        System.out.println("Introduce F o K: ");
        char T_temp=entrada.next().charAt(0);
        entrada.close();

        double Solucion=(T_temp=='F')?(9*G/5+32):(T_temp=='K')? (G+27315):(0);
        System.out.println(Solucion+ " "+T_temp);
    }
}
