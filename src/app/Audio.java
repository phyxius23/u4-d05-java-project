package app;

import java.util.Arrays;

public class Audio extends MediaElement {

  // Attributi
  private int duration;
  private int volume;

  // Costruttore
  public Audio(String t, int d, int v) {
    super(t);
    setDuration(d);
    setVolume(v);
  }

  // Getters & Setters
  public void setDuration(int d) {
    if (d < 0) {
      this.duration = 0;
    } else {
      this.duration = d;
    }
  }

  public int getDuration() {
    return this.duration;
  }

  public void setVolume(int v) {
    if (v < 0) {
      this.volume = 0;
    } else {
      this.volume = v;
    }
  }

  public int getVolume() {
    return this.volume;
  }

  // Metodi
  public void volumeDown() {
    this.volume--;
  };

  public void volumeUp() {
    this.volume++;
  }

  public void play() {
    char[] exclamationPoint = new char[getVolume()];

    // Arrays.fill(exclamationPoint, "!");
    // se utilizzo i doppi apici non funziona interpreta il ! come una stringa

    Arrays.fill(exclamationPoint, '!');

    for (int i = 0; i < getDuration(); i++) {
      System.out.println(getTitle() + "" + String.valueOf(exclamationPoint));
    }
  };

}
