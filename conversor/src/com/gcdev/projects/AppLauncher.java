package com.gcdev.projects;
import com.gcdev.projects.servicios.converter;

import java.util.Scanner;


public class AppLauncher {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        converter service = new converter();

        String monedaOrigen, monedaDestino ;
        double monto, resultado;

        System.out.println("Ingresar la moneda Origen: ");
        monedaOrigen = scanner.nextLine().toUpperCase();

        System.out.println("Ingresar la moneda Destino: ");
        monedaDestino = scanner.nextLine().toUpperCase();

        System.out.println("Ingresar el monto: ");
        monto = scanner.nextDouble();

        resultado = service.convertir(monedaOrigen,monedaDestino,monto);

        System.out.println("------------------------------");
        System.out.println("Monto:      " + monto + " " + monedaOrigen);
        System.out.println("Tasa:       " + monto/resultado);
        System.out.println("Resultado:  " + resultado + " " + monedaDestino);
        //System.out.println(monto/resultado);
    }
}