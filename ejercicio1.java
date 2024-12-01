import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Guardando los datos en el erreglo");
        for(int i=0; i<5; i++){
            System.out.print ((i+1)+ " Digite un numero: ");
            numeros[i]= entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementros del arregllo");
        for(float i:numeros){
            System.out.println(i);
        }
    }
}
