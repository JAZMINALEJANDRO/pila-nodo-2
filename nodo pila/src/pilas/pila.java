package pilas;

import java.util.Scanner;

public class pila {

    nodo primero;
    nodo ultimo;
    Scanner teclado = new Scanner(System.in);
    int contador =0;
    private nodo inicio;

    public pila() {
        primero = null;
        ultimo = null;

    }

    public void insertarnodo() {
        nodo nuevo = new nodo();
        System.out.println("ingrese el dato que contendra el nuevo nodo: ");
        nuevo.dato = teclado.nextInt();
        nuevo.siguiente = primero;
      primero = nuevo;
        System.out.println("\n Nodo ingresado con exito\n");
    }

    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println("" + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("La pila esta vacia vacia");
        }
    }

    public void eliminar() {
        nodo actual = new nodo();
        actual = primero;
        nodo anterior = new nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.println("ingrese el dato del nodo a eliminar:  ");
        int nodobuscado = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodobuscado) {
                    if (actual == primero) {
                        primero = primero.siguiente;
                   }else{
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\n Nodo con el dato " + actual.dato + " Eliminado \n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        }  
    }
    
    public void buscarnodo() {                 
        nodo actual=new nodo();
           actual=primero;
           boolean encontrado=false;
        System.out.println("ingrese el dato a buscar");
        int nodobuscado = teclado.nextInt();
      if(primero!=null){
        while(actual != null && encontrado != true){
            if (actual.dato == nodobuscado){
                System.out.println("\n nodo con el dato " + nodobuscado +  ".....encontrado \n");
                encontrado = true;
            }
             actual=actual.siguiente;
        }
            if(!encontrado){
              System.out.println("\n nodo no encontrado \n");
            }
           
        }else{
           System.out.println("pila se encuentra vacia");
      }
    
    }

}