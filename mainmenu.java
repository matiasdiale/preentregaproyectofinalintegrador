com.techlab.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

public static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);
   
   int opcionUsuario = 0;

//int AgregProdu = 0, listaProdu = 0, buscaActuali = 0, eliminProducto = 0; creaPedido = 0, listaPedido = 0, salir = 0,

system.out.println("""
                    1) Agregar producto
                    2) Listar productos
                    3) Buscar/Actualizar producto
                    4) Eliminar producto
                    5) Crear un pedido
                    6) Listar pedidos
                    7) Salir
Elija una opción:
                   """);


 // "String" nombre = entrada.nextLine();

 // "int edad" = entrada.nextInt();

     int opcionUsuario = entrada.nextInt();

 //if (){}else{}

   if (opcionUsuario < 1){
        System.out.println("Ingrese una opción válida");
   }else{ if (opcionUsuario > 7){
          }else{ System.out.println("Ingrese una opción válida del menú");
          }
       }
   } 
}
