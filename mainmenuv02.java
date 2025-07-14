package preentregaproyectofinalintegrador;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Producto> pedidos = new ArrayList<>();

        int opcionUsuario = 0;

        while (opcionUsuario != 7) {

            System.out.println("""
                ------------------------------
                 1) Agregar producto
                 2) Listar productos
                 3) Buscar/Actualizar producto
                 4) Eliminar producto
                 5) Crear un pedido
                 6) Listar pedidos
                 7) Salir
                ------------------------------
                 Elija una opción:
                """);

            opcionUsuario = entrada.nextInt();
            entrada.nextLine(); // Limpiar salto de línea

            if (opcionUsuario < 1) {
                System.out.println("Ingrese una opción válida");
            } else {
                if (opcionUsuario > 7) {
                    System.out.println("Ingrese una opción válida del menú");
                } else {

                    if (opcionUsuario == 1) {
                        System.out.println("Ingrese el producto");
                        System.out.println("Ingrese el nombre");
                        String nombre = entrada.nextLine();
                        System.out.printf("Ingrese el precio de %s: ", nombre);
                        double precio = entrada.nextDouble();
                        System.out.printf("Ingrese el stock de %s: ", nombre);
                        int stock = entrada.nextInt();
                        entrada.nextLine(); // limpiar buffer
                        Producto producto = new Producto(nombre, precio, stock);
                        productos.add(producto);
                        System.out.println("☣ Producto cargado exitosamente! ☣");

                    } else {
                        if (opcionUsuario == 2) {
                            if (productos.isEmpty()) {
                                System.out.println("⚠ No hay productos cargados.");
                            } else {
                                System.out.println("📦 Lista de productos:");
                                for (int i = 0; i < productos.size(); i++) {
                                    System.out.println(i + ") " + productos.get(i));
                                }
                            }
                        } else {
                            if (opcionUsuario == 3) {
                                if (productos.isEmpty()) {
                                    System.out.println("⚠ No hay productos para buscar o actualizar.");
                                } else {
                                    System.out.print("Ingrese el nombre del producto a buscar: ");
                                    String buscado = entrada.nextLine();
                                    boolean encontrado = false;
                                    for (Producto p : productos) {
                                        if (p.getNombre().equalsIgnoreCase(buscado)) {
                                            encontrado = true;
                                            System.out.println("🔎 Producto encontrado: " + p);
                                            System.out.print("¿Desea actualizarlo? (s/n): ");
                                            String respuesta = entrada.nextLine();
                                            if (respuesta.equalsIgnoreCase("s")) {
                                                System.out.print("Nuevo precio: ");
                                                double nuevoPrecio = entrada.nextDouble();
                                                System.out.print("Nuevo stock: ");
                                                int nuevoStock = entrada.nextInt();
                                                entrada.nextLine(); // limpiar buffer
                                                p.setPrecio(nuevoPrecio);
                                                p.setStock(nuevoStock);
                                                System.out.println("✅ Producto actualizado.");
                                            }
                                            break;
                                        }
                                    }
                                    if (!encontrado) {
                                        System.out.println("❌ Producto no encontrado.");
                                    }
                                }
                            } else {
                                if (opcionUsuario == 4) {
                                    if (productos.isEmpty()) {
                                        System.out.println("❌ No hay productos para eliminar.");
                                    } else {
                                        System.out.println("📦 Lista de productos:");
                                        for (int i = 0; i < productos.size(); i++) {
                                            System.out.println(i + ") " + productos.get(i));
                                        }

                                        System.out.print("Ingrese el número del producto a eliminar: ");
                                        int indice = entrada.nextInt();
                                        if (indice >= 0 && indice < productos.size()) {
                                            Producto eliminado = productos.remove(indice);
                                            System.out.println("✅ Producto eliminado: " + eliminado);
                                        } else {
                                            System.out.println("⚠ Índice inválido.");
                                        }
                                        entrada.nextLine(); // limpiar buffer
                                    }
                                } else {
                                    if (opcionUsuario == 5) {
                                        if (productos.isEmpty()) {
                                            System.out.println("❌ No hay productos para agregar al pedido.");
                                        } else {
                                            System.out.println("Seleccione productos para agregar al pedido (índice):");
                                            for (int i = 0; i < productos.size(); i++) {
                                                System.out.println(i + ") " + productos.get(i));
                                            }

                                            System.out.print("Ingrese índice del producto (o -1 para terminar): ");
                                            int indice = entrada.nextInt();
                                            while (indice != -1) {
                                                if (indice >= 0 && indice < productos.size()) {
                                                    pedidos.add(productos.get(indice));
                                                    System.out.println("Producto agregado al pedido.");
                                                } else {
                                                    System.out.println("⚠ Índice inválido.");
                                                }
                                                System.out.print("Ingrese otro índice (o -1 para terminar): ");
                                                indice = entrada.nextInt();
                                            }
                                            entrada.nextLine(); // limpiar buffer
                                        }
                                    } else {
                                        if (opcionUsuario == 6) {
                                            if (pedidos.isEmpty()) {
                                                System.out.println("📝 No hay pedidos creados.");
                                            } else {
                                                System.out.println("🧾 Pedido actual:");
                                                for (Producto p : pedidos) {
                                                    System.out.println(p);
                                                }
                                            }
                                        } else {
                                            if (opcionUsuario == 7) {
                                                System.out.println("👋 Saliendo del programa...");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

package preentregaproyectofinalintegrador;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Producto> pedidos = new ArrayList<>();

        int opcionUsuario = 0;

        while (opcionUsuario != 7) {

            System.out.println("""
                ------------------------------
                 1) Agregar producto
                 2) Listar productos
                 3) Buscar/Actualizar producto
                 4) Eliminar producto
                 5) Crear un pedido
                 6) Listar pedidos
                 7) Salir
                ------------------------------
                 Elija una opción:
                """);

            opcionUsuario = entrada.nextInt();
            entrada.nextLine(); // Limpiar salto de línea

            if (opcionUsuario < 1) {
                System.out.println("Ingrese una opción válida");
            } else {
                if (opcionUsuario > 7) {
                    System.out.println("Ingrese una opción válida del menú");
                } else {

                    if (opcionUsuario == 1) {
                        System.out.println("Ingrese el producto");
                        System.out.println("Ingrese el nombre");
                        String nombre = entrada.nextLine();
                        System.out.printf("Ingrese el precio de %s: ", nombre);
                        double precio = entrada.nextDouble();
                        System.out.printf("Ingrese el stock de %s: ", nombre);
                        int stock = entrada.nextInt();
                        entrada.nextLine(); // limpiar buffer
                        Producto producto = new Producto(nombre, precio, stock);
                        productos.add(producto);
                        System.out.println("☣ Producto cargado exitosamente! ☣");

                    } else {
                        if (opcionUsuario == 2) {
                            if (productos.isEmpty()) {
                                System.out.println("⚠ No hay productos cargados.");
                            } else {
                                System.out.println("📦 Lista de productos:");
                                for (int i = 0; i < productos.size(); i++) {
                                    System.out.println(i + ") " + productos.get(i));
                                }
                            }
                        } else {
                            if (opcionUsuario == 3) {
                                if (productos.isEmpty()) {
                                    System.out.println("⚠ No hay productos para buscar o actualizar.");
                                } else {
                                    System.out.print("Ingrese el nombre del producto a buscar: ");
                                    String buscado = entrada.nextLine();
                                    boolean encontrado = false;
                                    for (Producto p : productos) {
                                        if (p.getNombre().equalsIgnoreCase(buscado)) {
                                            encontrado = true;
                                            System.out.println("🔎 Producto encontrado: " + p);
                                            System.out.print("¿Desea actualizarlo? (s/n): ");
                                            String respuesta = entrada.nextLine();
                                            if (respuesta.equalsIgnoreCase("s")) {
                                                System.out.print("Nuevo precio: ");
                                                double nuevoPrecio = entrada.nextDouble();
                                                System.out.print("Nuevo stock: ");
                                                int nuevoStock = entrada.nextInt();
                                                entrada.nextLine(); // limpiar buffer
                                                p.setPrecio(nuevoPrecio);
                                                p.setStock(nuevoStock);
                                                System.out.println("✅ Producto actualizado.");
                                            }
                                            break;
                                        }
                                    }
                                    if (!encontrado) {
                                        System.out.println("❌ Producto no encontrado.");
                                    }
                                }
                            } else {
                                if (opcionUsuario == 4) {
                                    if (productos.isEmpty()) {
                                        System.out.println("❌ No hay productos para eliminar.");
                                    } else {
                                        System.out.println("📦 Lista de productos:");
                                        for (int i = 0; i < productos.size(); i++) {
                                            System.out.println(i + ") " + productos.get(i));
                                        }

                                        System.out.print("Ingrese el número del producto a eliminar: ");
                                        int indice = entrada.nextInt();
                                        if (indice >= 0 && indice < productos.size()) {
                                            Producto eliminado = productos.remove(indice);
                                            System.out.println("✅ Producto eliminado: " + eliminado);
                                        } else {
                                            System.out.println("⚠ Índice inválido.");
                                        }
                                        entrada.nextLine(); // limpiar buffer
                                    }
                                } else {
                                    if (opcionUsuario == 5) {
                                        if (productos.isEmpty()) {
                                            System.out.println("❌ No hay productos para agregar al pedido.");
                                        } else {
                                            System.out.println("Seleccione productos para agregar al pedido (índice):");
                                            for (int i = 0; i < productos.size(); i++) {
                                                System.out.println(i + ") " + productos.get(i));
                                            }

                                            System.out.print("Ingrese índice del producto (o -1 para terminar): ");
                                            int indice = entrada.nextInt();
                                            while (indice != -1) {
                                                if (indice >= 0 && indice < productos.size()) {
                                                    pedidos.add(productos.get(indice));
                                                    System.out.println("Producto agregado al pedido.");
                                                } else {
                                                    System.out.println("⚠ Índice inválido.");
                                                }
                                                System.out.print("Ingrese otro índice (o -1 para terminar): ");
                                                indice = entrada.nextInt();
                                            }
                                            entrada.nextLine(); // limpiar buffer
                                        }
                                    } else {
                                        if (opcionUsuario == 6) {
                                            if (pedidos.isEmpty()) {
                                                System.out.println("📝 No hay pedidos creados.");
                                            } else {
                                                System.out.println("🧾 Pedido actual:");
                                                for (Producto p : pedidos) {
                                                    System.out.println(p);
                                                }
                                            }
                                        } else {
                                            if (opcionUsuario == 7) {
                                                System.out.println("👋 Saliendo del programa...");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


package preentregaproyectofinalintegrador;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - Stock: " + stock;
    }
}

