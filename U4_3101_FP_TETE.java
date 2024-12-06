/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4_3101_fp_tete;

/**
 *
 * @author Pc
 */
import javax.swing.JOptionPane;
public class U4_3101_FP_TETE {
    public static void main(String[] args) {
        byte contador=1;
        float x;
        int r;
       do{
          x=Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
          
            if(x%2==0){
                r=(int)(x/2);
                for(int e=0; e<r;e++){
                    System.out.print(" * ");  
                }
                System.out.println();
            }else{
                JOptionPane.showMessageDialog(null, "El número es impar");
            } 
        contador++;
        }while (contador<=10);    
    }
    
}
