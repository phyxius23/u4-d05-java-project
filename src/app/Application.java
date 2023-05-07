package app;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    // attributi
    // MediaType type;
    String type;
    String title;
    // creo un array di tipo MediaElement poichè è l'unico tipo che può contenere
    // elementi di tipo audio, image e video
    MediaElement[] elements = new MediaElement[5];

    int duration;
    int volume;
    int brightness;

    // attivo la possibilità di recuperare i valori da terminale
    Scanner input = new Scanner(System.in);

    // ciclo fino a riempire l'array elements con 5 media
    // int i = 0; // counter per il ciclo while
    // while (i < 5) {

    // // seleziono il tipo di elemento tra un gruppo specifico di valori
    // System.out.println("Scegli quale tipo di elemento vuoi istanziare tra i
    // seguenti: audio, image, video");
    // type = input.nextLine();

    // // non posso utilizzare un ENUM perchè non so come gestire gli errori
    // // type = MediaType.valueOf(input.nextLine());

    // switch (type) {
    // case "audio":
    // // imposto il titolo
    // System.out.println("Imposta il titolo dell'audio: ");
    // title = input.nextLine();

    // // imposto il volume
    // System.out.println("Inserisci un numero intero per impostare il volume
    // dell'audio: ");
    // volume = input.nextInt();

    // // imposto la durata
    // System.out.println("Inserisci la durata dell'audio: ");
    // duration = input.nextInt();

    // // istanzio l'oggetto
    // elements[i] = new Audio(title, duration, volume);

    // // incremento il contatore
    // i++;
    // break;
    // case "image":
    // // imposto il titolo dell'elemento multimediale
    // System.out.println("Imposta il titolo dell'immagine: ");
    // title = input.nextLine();

    // // imposto la luminosità
    // System.out.println("Imposta la luminosità dell'immagine (solo numeri interi
    // positivi): ");
    // brightness = input.nextInt();

    // // istanzio l'oggetto
    // elements[i] = new Image(title, brightness);

    // // incremento il contatore
    // i++;
    // break;
    // case "video":
    // // imposto il titolo dell'elemento multimediale
    // System.out.println("Imposta il titolo del video: ");
    // title = input.nextLine();

    // // imposto il volume
    // System.out.println("Inserisci un numero intero per impostare il volume del
    // video: ");
    // volume = input.nextInt();

    // // imposto la durata
    // System.out.println("Inserisci la durata del video: ");
    // duration = input.nextInt();

    // // imposto la luminosità
    // System.out.println("Inserisci la luminosità del video: ");
    // brightness = input.nextInt();

    // // istanzio l'oggetto
    // elements[i] = new Video(title, duration, volume, brightness);

    // // incremento il contatore
    // i++;
    // break;
    // default:
    // System.out.println("Il tipo scelto non è valido.");
    // break;
    // }
    // }

    elements[0] = new Audio("traccia1", 2, 4);
    elements[1] = new Video("traccia2", 3, 6, 9);
    elements[2] = new Image("traccia3", 4);
    elements[3] = new Audio("traccia4", 3, 9);
    elements[4] = new Video("traccia5", 9, 9, 9);

    System.out.println(Arrays.asList(elements));

    // esecuzione dell'oggetto richiesto dall'utente
    readelements: while (true) {
      System.out
          .println("Seleziona un numero tra 1 e 5 per selezionare l'oggetto che vuoi eseguire oppure 0 per uscire: ");
      int element = input.nextInt();

      switch (element) {
        case 0:
          System.out.println();
          input.close();
          break readelements;
        case 1, 2, 3, 4, 5:
          // devo selezionare il metodo corretto a seconda del tipo di media istanziato
          if (elements[element - 1] instanceof Audio) {
            ((Audio) elements[element - 1]).play();
          } else if (elements[element - 1] instanceof Video) {
            ((Video) elements[element - 1]).play();
          } else {
            ((Image) elements[element - 1]).show();
          }
          break;
        default:
          System.out.println(
              "Hai inserito un valore errato. Sono accettati solo valori compresi tra 1 e 5 oppure 0 per uscire.");
          break;
      }
    }

    // sposto la chiusura di input nello switch => case 0 => così da poterlo
    // effettivamente chiudere
    // input.close();
  }

}
