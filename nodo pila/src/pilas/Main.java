package pilas;

import java.util.Scanner;

/**
 * Clase principa que implementa los metodos de la clase pila.
 * @author xavier
 */
public class Main {

  

   
    public static void main(String[] args) {
      int opt = 0;
        Scanner texto = new Scanner(System.in);
        pila c = new pila();
        do {
            System.out.println("1 agregar");
            System.out.println("2 mostrar");
            System.out.println("3 eliminar");
             System.out.println("4 buscar ");
            System.out.println("5 salir");
            
            switch (opt = texto.nextInt()) {
                case 1:
                    System.out.println("\n\n INSERTA NODO EN LA PILA \n");
                    c.insertarnodo();
                    break;
                case 2:
                    System.out.println("\n\n MOSTRAR PILA DE NODOS \n");
                    c.mostrar();
                    break;
                case 3:
                    System.out.println("\n\n ELIMINAR UN NODO DE LA PILA \n");
                    c.eliminar();
                    break;
                case 4:
                      System.out.println("\n\n BUSCAR UN NODO EN LA PILA \n");
                    c.buscarnodo();
                    
                    break;
                default:
                    System.out.println("opcion no valida"); 
                    break;
            }

        } while (opt != 5);

    }

}

