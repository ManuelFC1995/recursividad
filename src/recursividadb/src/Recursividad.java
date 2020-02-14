import java.util.Scanner;
public class Recursividad {

public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_YELLOW = "\u001B[33m";

  public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
  
        //ej1
        System.out.println(ANSI_CYAN + "EJERCICIO 1" + ANSI_RESET + " suma los numeros hasta el numero introducido");
        System.out.println("la suma es  " + ej1(leentero("")));
        pressAnyKeyToContinue();
        System.out.println(ANSI_CYAN + "EJERCICIO 2" + ANSI_RESET + " recorre un Array (1,2,3,4,5)");
        pressAnyKeyToContinue();
        //ej2   recorrer un Array
        int[] Array = {1, 2, 3, 4, 5};
        ej2(Array, 0);
        System.out.println("");
        pressAnyKeyToContinue();
        //ej3 buscar elemaneto enesimo de un Array
        System.out.println(ANSI_CYAN + "EJERCICIO 3 " + ANSI_RESET + "encuentra el elemento la la matriz del 1 al 5 \n "
                + "introduzca la posicion");
        System.out.println("el numero es " + ej3(Array, leentero("") - 1, 0));
        System.out.println("");
        pressAnyKeyToContinue();
        //ej 4 recorrer matriz
        System.out.println(ANSI_CYAN + "EJERCICIO 4 " + ANSI_RESET + " recorre una matriz de 2D {1,2,3},{3,4,5},{3,9,6} ");
        int[][] Matriz = {{1, 2, 3}, {3, 4, 5}, {3, 9, 6}};
        pressAnyKeyToContinue();
        ej4(Matriz, 0, 0, 3);
        System.out.println("");
        //ej 5 elemento n de la sucesion de fibonacci 
        System.out.println(ANSI_CYAN + "EJERCICIO 5" + ANSI_RESET + " dice el nuero de la posicion "
                + "n de la sucesion de fibonacci");
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        System.out.println("el numero es " + ej3(fibonacci, leentero("") - 1, 0));
        pressAnyKeyToContinue();
        //ej 7 invierte un string introducido por teclado
        System.out.println("El ejercicio 7 invierte un String introducido por teclado");
        //no funciona por que no se como pasarle la longitud del String introducido por teclado
        String palabra=LeeString();
        ej7(palabra, palabra.length()-1);
        pressAnyKeyToContinue();
        //ej 10 calcular el maximo valor de un array
        System.out.println("Calcula el maximo del Array del ejercicio 2");
        System.out.print("El maximo es"+ej10(Array, 0, 0));
    }

    //Suma los numeros hasta llegar a n
    public static int ej1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + ej1(n - 1));
        }
    }

    //recorre un array 
    public static void ej2(int[] Array, int pos) {

        if (pos == Array.length) {

        } else {
            System.out.print(ANSI_CYAN + "[" + ANSI_RESET + Array[pos] + ANSI_CYAN + "]" + ANSI_RESET);
            ej2(Array, pos + 1);
        }
    }

    public static int ej3(int[] Array, int posBuscada, int indice) {
        if (indice == posBuscada) {
            return Array[indice];
        } else {
            return ej3(Array, posBuscada, indice + 1);
        }
    }

    public static void ej4(int[][] Matriz, int I, int J, int Jlong) {

        if (J < Jlong && I < Matriz.length) {
            System.out.print(ANSI_CYAN + "[" + ANSI_RESET + Matriz[I][J] + ANSI_CYAN + "]" + ANSI_RESET);
            ej4(Matriz, I, J + 1, Jlong);
        } else if (I < Matriz.length) {
            System.out.println("");
            ej4(Matriz, I + 1, 0, Jlong);

        }

    }
    
    public static void ej7(String cadena, int pos){
        char[]invertir=cadena.toCharArray();
        if(pos==0)System.out.print(invertir[0]);
        
        else{
            System.out.print(invertir[pos]);
            ej7(cadena, pos-1);
        }
        
        
        
    }
    
    public static int ej10(int[] Array,int indice,int maximoActual ){
        
        if(indice==Array.length)return maximoActual;
        else{
                if(maximoActual<Array[indice])maximoActual=Array[indice];
                ej10(Array, indice+1, maximoActual);
                }return maximoActual;
    }
    
    
    public static String LeeString(){
        String frase="";
        System.out.println("intoduce la frase a invertir ");
        Scanner teclado=new Scanner(System.in);
        frase=teclado.nextLine();
        return frase;
        
    }

    static public void pressAnyKeyToContinue() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Press Enter key to continue..." + ANSI_RESET);
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }

    static int leentero(String msg) {
        int numero = -1;
        boolean valido = false;
        do {
            try {
                System.out.println(msg);
                java.util.Scanner teclado = new java.util.Scanner(System.in);
                numero = teclado.nextInt();
                valido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR: Introduzca un número entero");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!valido);
        return numero;
    }

}
