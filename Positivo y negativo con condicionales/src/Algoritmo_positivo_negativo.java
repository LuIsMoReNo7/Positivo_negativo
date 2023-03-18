import java.util.Scanner;
public class Algoritmo_positivo_negativo {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre = "";
        System.out.println("Ingrese su nombre: ");
        nombre = dato.nextLine();
        System.out.println("hola! " + nombre);
        System.out.println("Ingrese el numero");
        int num = dato.nextInt();
        if (num > 0){
            System.out.println("hola " + nombre + " " + "su numero" + num + " Es positivo! ");
        }
        else if (num == 0) {
            System.out.println("hola " + nombre + " " + "Su numero 0 no es negativo y tampoco es positivo! ");
        }
        else{
            System.out.println("Hola " + nombre + " " +  "Su numero " + num + " es negativo! ");
        }
    }
}
    