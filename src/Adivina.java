import java.util.Random;
import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        Scanner adivinar = new Scanner(System.in);
        int intentos = 1; // contador de intentos
        int aleatorio= new Random().nextInt(101); // numero aleatorio generado

      System.out.println(aleatorio);
      //
        System.out.println();
        System.out.println("""
                Bienvenido al juego de "Adivina el numero".
                El sistema a escogido aleatoriamente un numero entre 0 y 100.
                Tendras 5 intentos para adivinar.
                Podras hacerlo? Sin mas que agregar.... comenzemos!!!
                """);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingresa un numero:");
            int numeroIngresado = Integer.parseInt(adivinar.nextLine());
          if(numeroIngresado >= 0 && numeroIngresado <=100){
            if (numeroIngresado == aleatorio){
                System.out.println("Correcto!!! Has adivinado en " + intentos +( intentos > 1 ? " intentos":" intento") + ". Felicidades!!!");
                break;
            } else {
                if (intentos<5) {
                    String pista =(numeroIngresado>aleatorio?"mayor":"menor");
                    String fallido = """
                            Has fallado!!!
                            El numero ingresado (%d) es %s que el numero por adivinar.
                            Este fue tu intento #%d. Prueba de nuevo!
                            """.formatted(numeroIngresado,pista,intentos);
                    System.out.println(fallido);
                    intentos++;
                }else {
                    System.out.println("Lo siento, volviste a fallar y tus intentos se agotaron. El numero aleatorio era " + aleatorio + "!!");

                }
            }
          }else{
              System.out.println("""
                      El numero ingresado esta fuera del rango de 0 a 100.
                      No se conciderara como un intento.
                      Por favor ingresa un numero dentro del rango.
                      """);
              i--;
          }
        }
        System.out.println("Gracias por jugar!!");
      }
}
