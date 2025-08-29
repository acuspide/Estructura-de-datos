package co.edu.uniquindio.recursividad.recursividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversionDecimalBinarioRecursivo {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> binario = new ArrayList<>();
    static List<Integer> binario2 = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Ingrese el numero decimal");
        int n = sc.nextInt();
        conversion(n);
        System.out.println("binario 1: "+binario);
    }

        public static int conversion(int numero){
        if(numero==1){
            binario.addFirst(1);
            return 1;
        }
        binario.addFirst(numero%2);
        return conversion(numero/2);
    }
}
