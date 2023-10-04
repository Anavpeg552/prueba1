import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el numero de pizzas: ");
        int N_pizzas= entrada.nextInt();
        System.out.println("Introduce el numero de amigos: ");
        int N_amigos= entrada.nextInt();
        System.out.println("Porciones en las que se divide la pizza: ");
        int N_porciones= entrada.nextInt();
        entrada.close();

        int Porciones=(N_pizzas*N_porciones)/N_amigos;
        int Sobras_porciones=(N_pizzas*N_porciones)%N_amigos;

        System.out.println("Cada amigo toca a "+Porciones+ " porciones y sobra "+Sobras_porciones+" porciones" );
    }
}
