package app;

import java.util.Arrays;

public class Audio extends MediaElement {

  // attributi
  private int duration;
  private int volume;

  // costruttore
  public Audio(String t, int d, int v) {
    super(t);
    setDuration(d);
    setVolume(v);
  }

  // getter & setter
  public void setDuration(int d) {
    if (d >= 0) {
      this.duration = d;
    } else {
      this.duration = 0;
    }
  }

  public int getDuration() {
    return this.duration;
  }

  public void setVolume(int v) {
    if (v >= 0) {
      this.volume = v;
    } else {
      this.volume = 0;
    }
  }

  public int getVolume() {
    return this.volume;
  }

  // metodi
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
