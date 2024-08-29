import java.util.Scanner;

public class ContadorVocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine().toLowerCase();
        
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        
        System.out.println("La cadena contiene " + contador + " vocales.");
        
        sc.close();
    }
}

