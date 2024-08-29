import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora Básica");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opcion = sc.nextInt();
        
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        double resultado = 0;
        
        switch(opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        sc.close();
    }
}

