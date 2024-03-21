package newbank;

import java.util.ArrayList;
import java.util.List;

public class Funds {
    
    public static void main(String[] args) {
        
        List<Integer> funds = new ArrayList<>();
        funds.add(100);
        funds.add(900);
        funds.add(300);
        funds.add(0, 750);

        System.out.println("Fondos iniciales:");
        for (Integer fund : funds) {
            System.out.println(fund);
        }

        funds.remove(2); // Remover el tercer elemento
        System.out.println("Fondos después de la eliminación:");
        for (Integer fund : funds) {
            System.out.println(fund);
        }

        int suma = 0;
        for (Integer fund : funds) {
            suma += fund;
        }

        System.out.println("La suma total de los fondos es: " + suma);
    }
}