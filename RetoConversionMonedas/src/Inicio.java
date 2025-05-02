import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        double dolar = 500;
        double mexico = 25.78;
        double colombia = 0.20;
        double cuba = 21.03;
        double brasil = 89.21;




        int opcion = 0;



        String menu = """
                \n*****Coversion de Monedas*****
                \n***Eliga la opción deseada***
                1 - Convertir dolar a colones :
                2 - Convertir peso mexicano a colones :
                3 - Convertir peso colombiano a colones;
                4 - Convertir peso cubano a colones;
                5 - Convertir real brasileño a colones;
                9 - Salir:
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("¿Digite la cantidad a cambiar?");
                    double colon1 = teclado.nextDouble();
                    colon1 = colon1 * dolar;
                    System.out.println("El total de dolar a colones es : " + colon1);
                    break;
                case 2:
                    System.out.println("¿Digite la cantidad a cambiar?");
                    double colon2 = teclado.nextDouble();
                    colon2 = colon2 * colombia;
                    System.out.println("El total de peso colombiano  a colones es : " + colon2);
                    break;
                case 3:
                    System.out.println("¿Digite la cantidad a cambiar?");
                    double colon3 = teclado.nextDouble();
                    colon3 = colon3 * mexico;
                    System.out.println("El total de pesos mexicano  a colones es : " + colon3);
                case 4:
                    System.out.println("¿Digite la cantidad a cambiar?");
                    double colon4 = teclado.nextDouble();
                    colon4 = colon4 * cuba;
                    System.out.println("El total de pesos cubanos a colones es : " + cuba);
                    break;
                case 5:
                    System.out.println("¿Digite la cantidad a cambiar?");
                    double colon5 = teclado.nextDouble();
                    colon5 = colon5 * brasil;
                    System.out.println("El total de real brasileño a colones es : " + brasil);
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        }

    }
}

