package app;

import java.util.Arrays;

public class Image extends MediaElement implements Illuminable {

  // Attributi
  private int brightness;

  // Costruttore
  public Image(String t, int b) {
    super(t);
    setBrightness(b);
  }

  // Getters & Setters
  public void setBrightness(int b) {
    if (b < 0) {
      this.brightness = 0;
    } else {
      this.brightness = b;
    }
  }

  public int getBrightness() {
    return this.brightness;
  }

  // Metodi
  public void show() {
    char[] exclamationPoint = new char[getBrightness()];

    Arrays.fill(exclamationPoint, '*');

    System.out.println(getTitle() + "" + String.valueOf(exclamationPoint));
  }

  // Override dei metodi implementati da Illuminable
  @Override
  public void brightnessDown() {
    this.brightness--;
  }

  @Override
  public void brightnessUp() {
    this.brightness++;
  };
}
