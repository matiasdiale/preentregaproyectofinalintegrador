package preentregaproyectofinalintegrador;


import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();

        int opcionUsuario = 0;

        // Bucle while del menú, si no pongo la opción 7) Salir no termina el programa
        while (opcionUsuario != 7) {

//int AgregProdu = 0, listaProdu = 0, buscaActuali = 0, eliminProducto = 0; creaPedido = 0, listaPedido = 0, salir = 0,

        System.out.println("""
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

        opcionUsuario = entrada.nextInt();
        entrada.nextLine(); //   para que luego funcione nextLine(), limpia salto de línea

        //if (){}else{}

        if (opcionUsuario < 1) {
            System.out.println("Ingrese una opción válida");
        } else {
            if (opcionUsuario > 7) {
                System.out.println("Ingrese una opción válida del menú");
            } else {

                if (opcionUsuario == 1) {
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = entrada.nextLine();
                    System.out.printf("Ingrese el precio de %s: ", nombre);
                    double precio = entrada.nextDouble();
                    System.out.printf("Ingrese la cantidad de stock de %s que quiere ingresar: ", nombre);
                    int stock = entrada.nextInt();
                    Producto producto = new Producto(nombre, precio, stock);
                    productos.add(producto);
                    System.out.print("\n\n"); // 2 saltos de línea
                    System.out.println("☣ Producto cargado exitosamente! ☣");
                    System.out.print("\n\n"); // 2 saltos de línea
                    entrada.nextLine(); // limpiar buffer por si hay salto
                } else {
                    if (opcionUsuario == 2) {
                        System.out.println("📦 Lista de productos:");
                        for (Producto p : productos) {
                            System.out.println(p);
                            System.out.print("\n\n"); // 2 saltos de línea
                        }
                    } else {
                        if (opcionUsuario == 7) {
                            System.out.println("👋 Saliendo del programa...");
                        } else {
                            System.out.println("⚠️ Función no implementada todavía.");
                        }
                    }
                }
            }
        }
        }
    }
}

// 👇 Acá va la clase Producto fuera del main
class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - Stock: " + stock;
    }
}

