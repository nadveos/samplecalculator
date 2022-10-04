import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("|-------------------|");
        System.out.println("    CALCULADORA     ");
        System.out.println("|-------------------|");
        System.out.println("Elija una opción: \n"
        + "1 - Restar \n"
        + "2 - Sumar \n"
        + "3 - Dividir \n"
        + "4 - Multiplicar \n"
        + "5 - Salir"
        );
        try (Scanner sc = new Scanner(System.in)) {
            int op = sc.nextInt();
            SALIR:
            while(true){

                switch (op) {
                    case 1: restar();
                    break;
                    case 2: sumar();
                    break;
                    case 3:dividir();
                    break;
                    case 4:multiplicar();
                    break;
                    case 5: System.out.println("Saliendo de la CALCULADORA");
                    break SALIR;
                    
                    default: System.out.println("opcion incorrecta");
                    
                }
            }
        }

       
    }
    public static void restar(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese el primer valor");
            int v1 =scanner.nextInt();
            System.out.println("Ingrese el segundo valor");
            int v2 = scanner.nextInt();
            int res = v1 - v2;
            System.out.println("El resultado es : " + res);
        }
    }
    public static void sumar(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese el primer valor");
            int v1 =scanner.nextInt();
            System.out.println("Ingrese el segundo valor");
            int v2 = scanner.nextInt();
            int res = v1 + v2;
            System.out.println("El resultado es : " + res);
        }
    }
    public static void dividir(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese el primer valor");
            int v1 =scanner.nextInt();
            System.out.println("Ingrese el segundo valor");
            int v2 = scanner.nextInt();
            int res = v1 / v2;
            System.out.println("El resultado es : " + res);
        }
    }
    public static void multiplicar(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese el primer valor");
            int v1 =scanner.nextInt();
            System.out.println("Ingrese el segundo valor");
            int v2 = scanner.nextInt();
            int res = v1 *v2;
            System.out.println("El resultado es : " + res);
        }
    }
}
