package Cajero;
import java.util.Scanner;

public class Login {
    public int password = 5678; 
    public void Login(){
        int password1 = 0;
        
        int intento = 0;
        
        Scanner account = new Scanner (System.in);
        Scanner pass = new Scanner (System.in);
        System.out.println("Ingrese su numero de cuenta");
        String user = account.nextLine();
        System.out.println("");
        
        
        
           System.out.println("Ingrese su contraseña");
        password1 = pass.nextInt();
        
        while (password1 != password){
            System.out.println("Contraseña incorrecta");
            System.out.println("--------------------------");
            System.out.println("Ingrese su contraseña");
        password1 = pass.nextInt();
        
        while (intento <= 3){
            intento++;
            if (intento == 3){
            System.out.println("Ha exedido el número de intentos");
            System.out.println("Su cuenta ha sido bloqueada, comuniquese con servicio al cliente");
            System.exit(0);
            }
        }
        }
        } 
        
            
  }

            
            
       
                
                
            
