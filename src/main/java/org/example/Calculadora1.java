package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora1 {

    public static int suma(int a, int b) { return a + b; }
    public static int resta(int a, int b) { return a - b; }
    public static int multiplicacion(int a, int b) { return a * b; }
    public static int division(int a, int b) { return a / b; }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Elige la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3.Multiplicacion")
        System.out.println("4.Division")
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

            System.out.print("Introduce el primer número: ");
            int a = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int b = sc.nextInt();

            // Validar rangos antes de calcular
            validarRango(a);
            validarRango(b);

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + suma(a, b));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + resta(a, b));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + multiplicacion(a, b));
                    break;
                case 4:
                    System.out.println("Resultado de la división: " + division(a, b));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida: introduce números enteros. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}

