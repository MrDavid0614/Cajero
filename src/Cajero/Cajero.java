package Cajero;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Cajero {
    Login lg1 = new Login();
    Cliente cli1 = new Cliente();
    
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        int selection;
        
        System.out.print("--------");
        System.out.print(" Bienvenido ");
        System.out.println("--------");
        System.out.println("");
        System.out.println("Por favor seleccione una opcion");
        System.out.println("    1.Consulta de Saldo");
        System.out.println("    2.Retiro de efectivo");
        System.out.println("    3.Deposito de efectivo");
        System.out.println("    4.Salir");
        selection = option.nextInt();
        
        while (selection == 0 || selection >=5){
        System.out.print("--------------------------");
        System.out.print("ERROR");
        System.out.println("--------------------------");
        System.out.println("Por favor seleccione una opción valida");
        System.out.println("    1.Consulta de Saldo");
        System.out.println("    2.Retiro de efectivo");
        System.out.println("    3.Deposito de efectivo");
        System.out.println("    4.Salir");
        selection = option.nextInt();
        
        }
    }    
}
