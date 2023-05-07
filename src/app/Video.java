package app;

import java.util.Arrays;

public class Video extends Audio implements Illuminable {

  // attributi
  int brightness;

  // costruttori
  public Video(String t, int d, int v, int b) {
    super(t, d, v);
    this.brightness = b;
  }

  // override dei metodi implementati da Illuminable
  @Override
  public void brightnessDown() {
    this.brightness--;
  }

  @Override
  public void brightnessUp() {
    this.brightness++;
  }

  // override dei metodi implementati da Reproducible
  @Override
  public void play() {
    char[] exclamationPoint = new char[volume];
    char[] asterisk = new char[brightness];
    // creo un array di tipo char composto da un numero di elementi pari al valore
    // del volume

    // Arrays.fill(exclamationPoint, "!"); // se utilizzo i doppi apici non funziona
    // perchè interpreta il punto esclamativo come una stringa
    Arrays.fill(exclamationPoint, '!');
    Arrays.fill(asterisk, '*');

    for (int i = 0; i < duration; i++) {
      System.out.println(this.title + "" + String.valueOf(exclamationPoint) + String.valueOf(asterisk));
    }

  }

}
