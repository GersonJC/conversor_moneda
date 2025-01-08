package com.gcdev.projects;

import java.io.IOException;
import java.util.Scanner;

public class AppLauncher {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        sdsdsdsdsd
        */
        String apikey = "8d417e5c4b366fd6ccd0a0ab";
        String direcc = "https://v6.exchangerate-api.com/v6/"+apikey+"/latest/";

        Scanner scanner = new Scanner(System.in);

        String MonOri = "" ;
        String MonDes = "" ;


        System.out.println("Ingresar la moneda Origen");
        MonOri = scanner.nextLine().toUpperCase();

        String direccion = direcc + MonOri;



    }
}