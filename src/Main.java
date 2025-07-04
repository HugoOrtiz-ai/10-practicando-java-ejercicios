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
                case 1:
                    boolean volverAlMenu1 = false;

                    while (! volverAlMenu1) {
                        System.out.println("\nIngresa un número o presione 0 para volver al menú principal:");
                        double numeroUsuario = teclado.nextDouble();

                        if (numeroUsuario == 0){
                            volverAlMenu1 = true;
                        } else if (numeroUsuario % 2 == 0) {
                            System.out.println(String.format("Número del usuario = %.2f\nTu número es par." , numeroUsuario));
                        } else {
                            System.out.println(String.format("Número del usuario = %.2f\nTu número es impar." , numeroUsuario));
                        }
                    }
                    break;

                case 2:
                    boolean volverAlMenu2 = false;

                    while (! volverAlMenu2) {
                        System.out.println("\nIngrese el promedio final de alumn@ o presione 0 para volver al menú principal:");
                        double media = teclado.nextDouble();

                        if (media == 0) {
                            volverAlMenu2 = true;
                        } else if (media < 5) {
                            System.out.println(String.format("El estudiante tuvo un promedio de %.1f\nFue REPROBAD@." , media));
                        } else if (media >= 5 && media < 7) {
                            System.out.println(String.format("El estudiante tuvo un promedio de %.1f\nESTA EN RECUPERACIÓN." , media));
                        } else if (media >= 7 && media <= 10) {
                            System.out.println(String.format("El estudiante tuvo un promedio de %.1f\nFue APROBAD@." , media));
                        } else if (media > 10) {
                            System.out.println(String.format("El promedio %.1f no es válido.\nVerifique el promedio e intente de nuevo." , media));
                        }
                    }
                    break;

                case 3:
                    boolean volverAlMenu3 = false;

                    while (! volverAlMenu3) {
                        System.out.println("\nIngrese su contraseña de empleado para accesar al sistema o presione 0 para volver al menú principal:");
                        int contrasena = teclado.nextInt();
                        int contrasenaCorrecta = 123456;

                        if (contrasena == 0) {
                            volverAlMenu3 = true;
                        } else if (contrasena == contrasenaCorrecta) {
                            System.out.println("¡Acceso permitido!");
                        } else {
                            System.out.println(String.format("¡Acceso denegado!\nLa contraseña ingresada: %d es incorrecta.\nVerifique su contraseña e intente nuevamente." , contrasena));
                        }
                    }
                    break;

                case 4:
                    boolean volverAlMenu4 = false;

                    while (! volverAlMenu4) {
                        System.out.println("\nIngrese su primer número diferente de 0 o ingrese 0 para volver al menú inicial:");
                        double num1 = teclado.nextDouble();

                        if (num1 == 0) {
                            volverAlMenu4 = true;
                        } else if (num1 != 0) {
                            System.out.println("Ingrese su segundo número:");
                            double num2 = teclado.nextDouble();

                            if (num1 < num2) {
                                System.out.println(String.format("Primer numero ingresado: %.2f\nSegundo número ingresado: %.2f" , num1 , num2));
                                System.out.println(String.format("\nEl número %.2f es mayor" , num2));
                            } else if (num1 > num2){
                                System.out.println(String.format("Primer numero ingresado: %.2f\nSegundo número ingresado: %.2f" , num1 , num2));
                                System.out.println(String.format("\nEl número %.2f es mayor" , num1));
                            } else {
                                System.out.println("Ambos números son iguales.");
                            }
                        }
                    }
                    break;

                case 11:
                    System.out.println("Saliendo del Programa de ejercicios con Java.\n¡Gracias por tu visita, Hasta pronto!");
                    break;

                default:
                    System.out.println("*** Opción no válida. ***");
            }
        }
    }
}
