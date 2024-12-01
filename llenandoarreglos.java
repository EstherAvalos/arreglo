import javax.swing.JOptionPane;
import java.util.Scanner;
public class llenandoarreglos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de elementos: "));
         char[] letras=new char[nElementos];
         System.out.println(" Digite los elementos ");
         for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+ " Digite un caracter: ");
            letras[i]= entrada.next().charAt(0);
         }
         System.out.println("\nLos caracteres del arreglo son: ");
         for(int i=0;i<nElementos;i++){
            System.out.print(letras[i]+ " ");
         }
    }
}
