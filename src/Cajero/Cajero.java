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
    
    public static void main(String[] args) {
            Login lg1 = new Login();
            Cuenta cnt1 = new Cuenta();
            Cajero cj1 = new Cajero();
            
            lg1.Login();
            cj1.menu();
        }
    
        public void menu (){
        Cliente cli1 = new Cliente();
        Login lg1 = new Login();
        Cuenta cnt1 = new Cuenta();
        
        Scanner option = new Scanner(System.in);
        Scanner option1  = new Scanner(System.in);
        int selection;
        String transact;
        
        System.out.print("--------");
        System.out.print(" Bienvenido ");
        System.out.println("--------");
        System.out.println("");
        System.out.println("Por favor seleccione una opcion");
        System.out.println("    1.Consulta de Saldo");
        System.out.println("    2.Retiro de efectivo");
        System.out.println("    3.Deposito de efectivo");
        System.out.println("    4.Cambiar contraseña");
        System.out.println("    5.Salir");
        selection = option.nextInt();
        
        while (selection == 0 || selection >=6){
        System.out.print("--------------------------");
        System.out.print("ERROR");
        System.out.println("--------------------------");
        System.out.println("Por favor seleccione una opción valida");
        System.out.println("    1.Consulta de Saldo");
        System.out.println("    2.Retiro de efectivo");
        System.out.println("    3.Deposito de efectivo");
        System.out.println("    4.Cambiar contraseña");
        System.out.println("    5.Salir");
        selection = option.nextInt();
            }
        
        if (selection == 1){
            cnt1.viewBalance();
        }
        else if (selection == 2){
            cnt1.withdraw();
          }
        else if (selection == 3){
            cnt1.depositMoney();
        }
        else if (selection == 4){
            cnt1.changePassword();
            }
        else if (selection == 5) {
            System.out.println("Ha salido exitosamente!");
            System.exit(0);
        }
                
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("¿Desea hacer algo más? S/N");
            transact = option1.next();
            System.out.println("------------------------------");
            
            if (transact == "S" || transact == "s") {    
                System.out.println("Por favor seleccione una opcion");
                System.out.println("    1.Consulta de Saldo");
                System.out.println("    2.Retiro de efectivo");
                System.out.println("    3.Deposito de efectivo");
                System.out.println("    4.Salir");
                selection = option.nextInt();
                }
                else if (transact == "N" || transact == "n") {
                    System.out.println("Gracias por preferirnos! :D");
                    System.exit(0);
                }
                else {
                System.out.println("Opción no válida");
                }
          }
        }
              
 