import java.util.Random;
import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        Scanner adivinar = new Scanner(System.in);
        int intentos = 1; // contador de intentos
        int aleatorio= new Random().nextInt(100); // numero aleatorio generado

      System.out.println(aleatorio);  // linea de impresion con propositos de prueba

        // Despliegue de mensaje de bienvenida
        System.out.println();
        System.out.println("""
                Bienvenido al juego de "Adivina el numero".
                El sistema a escogido aleatoriamente un numero entre 0 y 100.
                Tendras 5 intentos para adivinar.
                Podras hacerlo? Sin mas que agregar.... comenzemos!!!
                """);

        // Incio de bucle para 5 intentos
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingresa un numero:");
            int numeroIngresado = Integer.parseInt(adivinar.nextLine()); // se obtiene el numero ingresadopor el usuario

          if(numeroIngresado >= 0 && numeroIngresado <=100){ // se verifica que el numero ingresado este dentro del rango
            if (numeroIngresado == aleatorio){ // se verifica que si el numero ingresado es igual a aleatorio
                System.out.println("Correcto!!! Has adivinado en " + intentos +( intentos > 1 ? " intentos":" intento") + ". Felicidades!!!"); // confirmacion que se acerto el numero
                break; // salida del bucle
            } else {
                if (intentos<5) { // verificacion de nuemro de intentos
                    String pista =(numeroIngresado>aleatorio?"mayor":"menor"); // Aca se define si el numero ingresado es mayor o menor
                    String fallido = """   
                            Has fallado!!!
                            El numero ingresado (%d) es %s que el numero por adivinar.
                            Este fue tu intento #%d. Prueba de nuevo!
                            """.formatted(numeroIngresado,pista,intentos); // genracion de mensaje fallido
                    System.out.println(fallido); // confirmacion que el numero es incorrecto, si es mayor o menor y la cantidad de intentos al momento
                    intentos++; // incrementa el contador de intentos
                }else {
                    System.out.println("Lo siento, volviste a fallar y tus intentos se agotaron. El numero aleatorio era " + aleatorio + "!!"); // Confirmacion de que los intentos se han acabadp

                }
            }
          }else{
              System.out.println("""
                      El numero ingresado esta fuera del rango de 0 a 100.
                      No se conciderara como un intento.
                      Por favor ingresa un numero dentro del rango.
                      """); // despliega mensaje que advierte que el numero esta fuera de rango
              i--; // decrementa el contador del bucle principal para evitar acumular intentos por numeros fuera de rango ( cortesia del juego)
          }
        }
        System.out.println("Gracias por jugar!!"); // mensaje de despedida
      }
}
