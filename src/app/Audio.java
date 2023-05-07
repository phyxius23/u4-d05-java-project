package app;

import java.util.Arrays;

public class Audio extends MediaElement {

  // attributi
  int duration;
  int volume;

  // costruttori
  public Audio(String t, int d, int v) {
    super(t);
    this.duration = d;
    this.volume = v;
  }

  // metodi
  public void volumeDown() {
    this.volume--;
  };

  public void volumeUp() {
    this.volume++;
  }

  // @Override del metodo implementato dall'interfaccia Reproducible
  public void play() {
    char[] exclamationPoint = new char[volume];
    // creo un array di tipo char composto da un numero di elementi pari al valore
    // del volume

    // Arrays.fill(exclamationPoint, "!"); // se utilizzo i doppi apici non funziona
    // perchè interpreta il punto esclamativo come una stringa
    Arrays.fill(exclamationPoint, '!');

    for (int i = 0; i < duration; i++) {
      System.out.println(this.title + "" + String.valueOf(exclamationPoint));
    }

  };

}
