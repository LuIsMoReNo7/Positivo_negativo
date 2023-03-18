import java.util.Scanner;
public class Bucle { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int Numero_ingresado = entrada.nextInt();
        int suma = 0;
        for (int numero = 1; numero <= Numero_ingresado ; numero ++) {
            System.out.println(numero);
            suma = suma + numero;
     
         }
     System.out.println("La suma es: "+ suma);
    }
}
