import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in );
        float numero[]= new float[5];
        for(int i=0; i<5; i++){
            System.out.print((i+1)+ " Digite un número: ");
            numero[i]= entrada.nextFloat();
        }
        System.out.println("Elementos invertidos:");
        for(float i:numero){
            System.out.println(i);
        }
    }
}
