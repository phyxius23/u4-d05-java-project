package app;

import java.util.Arrays;

public class Image extends MediaElement implements Illuminable {

  // attributi
  int brightness;

  // costruttori
  public Image(String t, int b) {
    super(t);
    this.brightness = b;
  }

  // metodi
  public void show() {
    char[] exclamationPoint = new char[brightness];
    // creo un array di tipo char composto da un numero di elementi pari al valore
    // del volume

    // Arrays.fill(exclamationPoint, "!"); // se utilizzo i doppi apici non funziona
    // perchè interpreta il punto esclamativo come una stringa
    Arrays.fill(exclamationPoint, '*');

    System.out.println(this.title + "" + String.valueOf(exclamationPoint));

  }

  // override dei metodi implementati da Illuminable
  @Override
  public void brightnessDown() {
    this.brightness--;
  }

  @Override
  public void brightnessUp() {
    this.brightness++;
  };
}
