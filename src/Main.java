import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        int opcion = 0;

        System.out.println("\n*********************");

        String menu = """
                \n*** Bienvenid@, Selecciona una opción deseada ***\n
                1 - Verificar número par o impar.
                2 - Verificar aprobación de asignaturas.
                3 - Validación de contraseñas.
                4 - Comparando dos números.
                5 - Verificación de descuento en compras.
                6 - Verificación de día hábil.
                7 - Verificando si un número esta en un intervalo.
                8 - Verificación de triángulo.
                9 - Verificar compatibilidad sanguínea.
                10 - Verificación de código de acceso y nivel de permiso.
                11 - Salir.
                """;

        while (opcion != 11) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 11:
                    System.out.println("Saliendo del Programa de ejercicios con Java.\n¡Gracias por tu visita, Hasta pronto!");
                    break;

                default:
                    System.out.println("*** Opción no válida. ***");
            }
        }
    }
}
