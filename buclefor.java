public class buclefor {
    public static void main(String[] args) {
        String[] nombres= {"MARIA", "Alejandro", "Luisa", "Juan", "Luis"};
        /*for(int i=0;i<nombres.length;i++){ /ciclo para imprimir los elementos dentro del arreglo nombres
            System.out.println(nombres[i]);*/ 
            for(String i:nombres){/*se van a copiar todos los elementos que tenga el arreglo
                                    con este bucle ahorramos todo el trabajo del bucle for*/ 
                System.out.println("Nombre: "+i);
            }
        }
    }
 
