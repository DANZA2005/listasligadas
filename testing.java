import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato, posicion;
        ListaLigada lista = new ListaLigada();
        char respuesta;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ingresar dato al principio");
            System.out.println("2. Ingresar dato al final");
            System.out.println("3. Ingresar dato en una posición específica");
            System.out.println("4. Eliminar dato al principio");
            System.out.println("5. Eliminar dato al final");
            System.out.println("6. Eliminar dato en una posición específica");
            System.out.println("7. Imprimir lista");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);

            switch (respuesta) {
                case '1':
                    System.out.print("Escribe el dato a ingresar al principio: ");
                    entrada = bufer.readLine();
                    dato = Integer.parseInt(entrada);
                    lista.addFirst(dato);
                    break;
                case '2':
                    System.out.print("Escribe el dato a ingresar al final: ");
                    entrada = bufer.readLine();
                    dato = Integer.parseInt(entrada);
                    lista.add(dato);
                    break;
                case '3':
                    System.out.print("Escribe el dato a ingresar: ");
                    entrada = bufer.readLine();
                    dato = Integer.parseInt(entrada);
                    System.out.print("Escribe la posición donde deseas ingresar el dato: ");
                    entrada = bufer.readLine();
                    posicion = Integer.parseInt(entrada);
                    lista.add(dato, posicion);
                    break;
                case '4':
                    lista.removeFirst();
                    break;
                case '5':
                    lista.removeLast();
                    break;
                case '6':
                    System.out.print("Escribe la posición del dato a eliminar: ");
                    entrada = bufer.readLine();
                    posicion = Integer.parseInt(entrada);
                    lista.remove(posicion);
                    break;
                case '7':
                    System.out.println("Contenido de la lista:");
                    lista.print();
                    break;
                case '8':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (respuesta != '8');
    }
}
