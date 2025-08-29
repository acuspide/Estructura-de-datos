package co.edu.uniquindio.recursividad.recursividad;

import java.util.Scanner;

public class SumaProductos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ingrese el primer numero a multiplicar:");
        int veces = sc.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar:");
        int valor = sc.nextInt();
        System.out.printf("el resultado es: "+suma(veces, valor));
    }

    public static int suma(int veces, int valor){
        if (veces == 0){
            return 0;
        }
        if (veces > 0){
            return valor + suma(veces - 1, valor);
        }else {


            if (valor <0)  {
                return  -valor + suma(-veces-1, -valor);
            } else {
                return -valor +suma(veces+1, valor);
            }

        }
    }
}
