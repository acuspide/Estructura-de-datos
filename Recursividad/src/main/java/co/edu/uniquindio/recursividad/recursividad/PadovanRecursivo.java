package co.edu.uniquindio.recursividad.recursividad;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class PadovanRecursivo {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> serie = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Ingrese el numero para generar la serie padovan");
        int n= sc.nextInt();
        for(int i=0; i<=n; i++){
            if((i==0)||(i==1)||(i==2)){
                serie.add(1);
            }else{
                serie.add(padovan(i));
            }
        }
        System.out.println("la serie padovan es:\n"+serie.toString());
    }

    public static int padovan(int n){
        if(n<=0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return padovan(n-2)+padovan(n-3);
    }
    @Override
    public String toString() {
        return "PadovanRecursivo{" +
                "serie=" + serie +
                '}';
    }

}
